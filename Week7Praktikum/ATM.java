public class ATM
{
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;
   
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
   
    public ATM(){
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
    }
   
   
    public void run(){
        while(true){
            while(!userAuthenticated){
                screen.displayMessageLine("\nWelcome!");
                authenticateUser();    
            }  
           
            performTransactions();      
            userAuthenticated = false;  
            currentAccountNumber = 0;  
            screen.displayMessageLine("\nThank You!\nGoodbye!");
        }
    }
 
    private void authenticateUser(){
        screen.displayMessage("\nPlease enter your account number : ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nEnter your PIN : ");
        int pin = keypad.getInput();
       
        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);
       
        if(userAuthenticated){
            currentAccountNumber = accountNumber;  
        }
        else{
            screen.displayMessageLine("Invalid Account Number or PIN.");
            screen.displayMessageLine("Please Try Again.");
        }
    }
 
    private void performTransactions(){
     
        Transaction currentTransaction = null;
        boolean userExited = false;  
       
        while(!userExited){
            int mainMenuSelection = displayMainMenu();
 
            switch(mainMenuSelection){
                case BALANCE_INQUIRY :
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case WITHDRAWAL :
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    createTransaction(BALANCE_INQUIRY).execute();            
                    break;
                case DEPOSIT :
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    boolean status2 = Deposit.Show(); 
                    if(status2){
                        createTransaction(BALANCE_INQUIRY).execute();
                    }
                    break;
                case EXIT :
                    screen.displayMessageLine("\nExiting the system...");
                    userExited = true;    
                    break;
                default :
                    screen.displayMessageLine("\nYou did not enter a valid selection.");
                    screen.displayMessageLine("Please try again.");
                    break;
            }  
        }
    }  
 
    private int displayMainMenu(){
        screen.displayMessageLine("\nMain Menu :");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash");
        screen.displayMessageLine("3 - Deposit funds");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter a choice : ");
        return keypad.getInput();
    }
   
    private Transaction createTransaction(int type){
        Transaction temp = null;      
        switch(type){
            case BALANCE_INQUIRY :
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL :
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT :
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }  
        return temp;  
    }  
}
