import java.util.Scanner;

public class Phone {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		

	gotoMainMenu();
	
	}

	public static void gotoMainMenu() {
		
		System.out.println("Welcome to Nokia");

		String mainMenu = """
		1 -> Phone book
		2 -> Message
		3 -> Chat
		4 -> Call register
		5 -> Tones
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Reminder
		11 -> Clock
		12 -> Profiles
		13 -> Sim services
		""";

		System.out.println(mainMenu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
       
		switch(userInput) {
		
			case '1' : displayPhoneBook(); break;
			case '2' : showMessage(); break;
			case '3' : showChat(); break;
			case '4' : showCallRegister(); break;
			case '5' : showTones(); break;
			case '6' : showSettings(); break;
			case '7' : showCallDivert(); break;
			//case '8' : games(); break;
			case '9' : showCalculator(); break;
			case 'A' : showReminder(); break;
			case 'B' : showClock(); break;
			case 'C' : showProfiles(); break;
			case 'D' : showSimServices(); break;

			default : gotoMainMenu();
		}

	}
	
	public static void displayPhoneBook() {
		System.out.println("Welcome to phoneBook");
		
		String menu = """
		1 -> Search
           	2 -> Service Nos
            	3 -> Add name
            	4 -> Erase
            	5 -> Edit
            	6 -> Assign tone
            	7 -> Send b'card
            	8 -> Options
            	9 -> Speed Dials
            	A -> Voice Tags
		B -> Back
           	 """;

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		switch(userInput){
			
			case '1' : search(); break;
           		case '2' : serviceNos(); break;
            		case '3' : addName(); break;
            		case '4' : erase(); break;
            		case '5' : edit(); break;
			case '6' : assignTone(); break;
            		case '7' : sendBCard(); break;
            		case '8' : options(); break;
                	case '9' : speedDials(); break;
            		case 'A' : voiceTags(); break;
			case 'B' : gotoMainMenu(); break;
			default: gotoMainMenu();
		}	
	
	} 

	public static void search() {
    		System.out.println("Welcome to Search Service");
    		String menu1 = """
		1 -> Nothing Here1
		2 -> Main menu	
		""";

    		System.out.println(menu1);
    		System.out.println("Enter preferred number: ");
    		char userInput = input.nextLine().charAt(0);

    		switch (userInput) {
        		case '1': nothingHere1(); break;
			case '2' :displayPhoneBook(); break;
        		default: gotoMainMenu();
    		   }
		}

	public static void nothingHere1(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

		}
	
	public static void serviceNos() {
		System.out.println("Welcome to the Service Nos Screen.");
		
		String menu2 = """
		1-> Nothing here
		2 -> Main menu	
		""";
		
		
		System.out.println(menu2);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': nothingHere(); break;
			case '2' : displayPhoneBook(); break;
			default: gotoMainMenu();;
		}
	}
	
	public static void nothingHere(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}
		}

	public static void addName() {

		System.out.println("Welcome to Add Name Screen.");
		
		String menu3 = """
		1 -> Empty
		2 -> Main menu	
		""";
			

		System.out.println(menu3);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': empty(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();	
		}
	}

	public static void empty(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

	}


	public static void erase(){

		System.out.println("Welcome to Erase screen.");

		String menu4 = """
		1-> Empty1
		2 -> Main menu	
		""";
		

		System.out.println(menu4);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': empty1(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();
		}
	}

	public static void empty1(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void edit() {
		
		System.out.println("Welcome to Edit screen");
		String menu5 = """
		1 -> Empty2
		2 -> Main menu	
		""";
		

		System.out.println(menu5);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': empty2(); break;
			case '2': displayPhoneBook(); break;
			default:  gotoMainMenu();
		}
	}

	public static void empty2(){
	
		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}
		

		}


	public static void assignTone(){

		System.out.println("Welcome to Assign Tone Screen.");

		String menu6 = """
		1-> Nothing Here
		2 -> Main menu	
		""";
		

		System.out.println(menu6);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': nothingHere2(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();
		}
	}

	public static void nothingHere2(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void sendBCard(){

		System.out.println("Welcome to Send card Screen.");

		String menu7 = """
		1-> Empty3
		2 -> Main menu	
		""";
		

		System.out.println(menu7);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': empty3(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();

			}
		}

	public static void empty3(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}
		}

	public static void options(){

		System.out.println("Welcome to Options Screen.");

		String menu8 = """
		1 -> Type of views
                2 -> Memory Status
		3 -> Main menu
		""";
		
		System.out.println(menu8);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': typeOfViews(); break;
			case '2' : memoryStatus(); break;
			case '3' : displayPhoneBook(); break;
			default: gotoMainMenu();

		}
	}

	public static void typeOfViews(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void memoryStatus(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': displayPhoneBook(); break;
			default: gotoMainMenu();
	
			}

		}
	
	public static void speedDials(){
	
		System.out.println("Welcome to Speed Dial Screen");

		String menu9 = """
		1 -> Empty
		2 -> Main menu	
		""";
		

		System.out.println(menu9);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
			
			case '1': empty(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();

			}
		}

	public static void voiceTags(){

		System.out.println("Welcome to Voice Tags Screen.");

		String menu10 = """
		1-> No voiceTag
		2 -> Main menu	
		""";
		

		System.out.println(menu10);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empty(); break;
			case '2': displayPhoneBook(); break;
			default: gotoMainMenu();
		}

	}
	
	public static void showMessage(){

		System.out.println("Welcome to Message");

		String menu = """
		1-> Write Messages
		2-> Inbox
		3-> Outbox
		4-> Picture Message
		5-> Templates
		6-> Smiley
		7-> Message Settings
		8-> Info Service
		9-> Voice Mailbox Number
		A-> Service Command Editor
		B-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered Number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){

			case '1' : showWriteMessage(); break;
			case '2' : showInbox(); break;
			case '3' : showOutbox(); break;
			case '5' : displayTemplate(); break;
			case '6' : displaySmiley(); break;
			case '7' : showMessageSettings(); break;
			case '8' : showInfoService(); break;
			case '9' : showVoiceMailNumber(); break;
			case 'A' : showServiceCommandEditor(); break;
			case 'B' : gotoMainMenu(); break;
			default : showMessage();
			
			}
		}

	public static void showWriteMessage(){
		
		System.out.println("Welcome to Message Screen.");

		String menu = """		
		1-> No Message
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyF(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyF(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showInbox(){

		System.out.println("Welcome to Inboc Screen.");

		String menu = """
		1-> No Inbox
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyA(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyA(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showOutbox(){

		System.out.println("Welcome to Outbox Screen.");

		String menu = """
		1-> No Outbox
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyB(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyB(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showPictureMessage(){

		System.out.println("Welcome to Picture Message Screen.");

		String menu = """
		1-> No Picture Message
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyC(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyC(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void displayTemplate(){

		System.out.println("Welcome to Display Template Screen.");

		String menu = """
		1-> No Display Template
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyD(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyD(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void displaySmiley(){

		System.out.println("Welcome to Smiley Screen.");

		String menu = """
		1-> No Smiley
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': notFound(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void notFound(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showMessageSettings(){
	
		System.out.println("Welcome to Message Settings Screen.");

		String menu1 = """
		1-> Set
		2 -> Common
		3-> Main Menu	
		""";
		

		System.out.println(menu1);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showSet(); break;
			case '2': showCommon(); break;
			case '3': showMessage(); break;
			default: gotoMainMenu();
		}

	}

	public static void showSet(){

		System.out.println("Welcome to Voice Tags Screen.");

		String menu = """
		1-> Message Center Number
		2 -> Message Sent
		3 -> Message Validity
		4 -> Main Menu 	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showMessageCenterNumber(); break;
			case '2': showMessageSent(); break;
			case '3': showMessageValidity(); break;
			case '4': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void showMessageCenterNumber(){

		System.out.println("Welcome to Message Center Number Screen.");

		String menu = """
		1-> No Message Center Numer
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empty11(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void empty11(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showMessageSent(){

		System.out.println("Welcome to Show Message Sent Screen.");

		String menu = """
		1-> No Message Sent
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyE(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyE(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}
	public static void showMessageValidity(){

		System.out.println("Welcome to Show Message Validity Screen.");

		String menu10 = """
		1-> No Message Validity
		2 -> Main menu	
		""";
		

		System.out.println(menu10);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empt(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void empt(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showCommon(){

		System.out.println("Welcome to Common Screen.");

		String menu = """
		1-> Delivery Report
		2-> Reply via Same Center
		3-> Character Support
		4 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showDeliveryReports(); break;
			case '2': showReplyViaSameCenter(); break;
			case '3': showCharacterSupport(); break;
			case '4': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void showDeliveryReports(){

		System.out.println("Welcome to Delivery Reports Screen.");

		String menu = """
		1-> No Delivery Report
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empty4(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void empty4(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showReplyViaSameCenter(){

		System.out.println("Welcome to Reply Via Same Center Screen.");

		String menu = """
		1-> No Reply Via Same Center
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empty5(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void empty5(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showCharacterSupport(){

		System.out.println("Welcome to Character Support Screen.");

		String menu = """
		1-> No Character Support
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': empty7(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void empty7(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showInfoService(){

		System.out.println("Welcome to Show Info Service Screen.");

		String menu = """
		1-> NUll
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': notfound(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void notfound(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showServiceCommandEditor(){

		System.out.println("Welcome to Service Command Editor Screen.");

		String menu = """
		1-> Nothing
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': nothing(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void nothing(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showVoiceMailNumber(){

		System.out.println("Welcome to VoiceMail Number Screen.");

		String menu = """
		1-> Does Not Exist
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': notExist(); break;
			case '2': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void notExist(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showMessage(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showChat(){

		System.out.println("Welcome to Chat Screen");

		String menu = """
		1-> Not Exist
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noexist(); break;
			case '2' :gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noexist(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}

	}	

	public static void showCallRegister(){

		System.out.println("Welcome to Call Register");

		String menu = """
		1-> Missed Calls
		2-> Received Calls
		3-> Dialled Numbers
		4-> Erase Recent Call Lists
		5-> Show Call Duration
		6-> Show Call Cost
		7-> Call Cost Settings
		8-> Prepaid Credit
		9-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered Number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){

			case '1' : showMissedCalls(); break;
			case '2' : showRecievedCalls(); break;
			case '3' : showEraseRecentCallLists(); break;
			case '5' : showCallDuration(); break;
			case '6' : showCallCost(); break;
			case '7' : showCallSettings(); break;
			case '8' : showPrepaidCredit(); break;
			case '9' : gotoMainMenu(); break;
			default: gotoMainMenu();
			
			}
		}

	public static void showMissedCalls(){

		System.out.println("Welcome to Missed Calls Screen.");

		String menu = """
		1-> No Missed Calls
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': nocall(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void nocall(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showRecievedCalls(){

		System.out.println("Welcome to Recevied Calls Screen.");

		String menu = """
		1-> No Received Calls
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noReceived(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noReceived(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showEraseRecentCallLists(){

		System.out.println("Welcome to Recent Call Lists creen.");

		String menu = """
		1-> No Recent Call Lists
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noCallList(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noCallList(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}
	
	public static void showCallDuration(){

		System.out.println("Welcome to Call Duration Screen.");

		String menu = """
		1-> Last Call Duration
		2 -> All Calls Duration
		3 -> Received Calls Duration
		4 -> Dialled Calls Duration
		5 -> Clear Timer
		6 -> Main Menu 	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showLastCallDuration(); break;
			case '2': showAllCallDuration(); break;
			case '3': showReceivedCallDuration(); break;
			case '4': showDialledCallDuration(); break;
			case '5': showClearTimer(); break;
			case '6': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void showLastCallDuration(){

		System.out.println("Welcome to Last Call Duartion Screen.");

		String menu = """
		1-> No Last Call Duration
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': nolastCallDuration(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void nolastCallDuration(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}
	
	}

	public static void showAllCallDuration(){

		System.out.println("Welcome to All Call Duration Screen.");

		String menu = """
		1-> no ALL Call Duration
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': emptyCallDuration(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void emptyCallDuration(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showReceivedCallDuration(){

		System.out.println("Welcome to Received Call Duration Screen.");

		String menu = """
		1-> No Received Call Duration
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': diplayReceivedCallDuartion(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();

			}
		}

	public static void diplayReceivedCallDuartion(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showDialledCallDuration(){

		System.out.println("Welcome to Dialled Call Duration Screen.");

		String menu = """
		1-> No Dialled Call Duration
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noDialledCallDuartion(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noDialledCallDuartion(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showClearTimer(){

		System.out.println("Welcome to Clear Timer Screen.");

		String menu = """
		1-> No Timer
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noTimer(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noTimer(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showCallCost(){

		System.out.println("Welcome to Call Cost Screen.");

		String menu = """
		1-> Last Call Cost
		2-> All call Cost
		3 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showLastCallCost(); break;
			case '2': showAllCallCost(); break;
			case '3': showCallRegister(); break;
			default: gotoMainMenu();
		}	
	}

	public static void showLastCallCost(){

		System.out.println("Welcome to Show Last Call CostScreen.");

		String menu = """
		1-> No Last Call Cost
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noLastCallCost(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noLastCallCost(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}
	
	}

	public static void showAllCallcost(){

		System.out.println("Welcome to All Call Cost Screen.");

		String menu = """
		1-> No ALL Call Cost
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noAllCallCost(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}

	}
	
	public static void noAllCallCost(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}


	public static void showCallSettings(){

		System.out.println("Welcome to Call Cost Settings Screen.");

		String menu = """
		1-> Call Cost Limit
		2-> All Call Cost
		3 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showCallCost(); break;
			case '2': showAllCallCost(); break;
			case '3': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void diplayCallCost(){

		System.out.println("Welcome to Show Call Cost Screen.");

		String menu = """
		1-> No Call Cost
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoCallCost(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}


	public static void showNoCallCost(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showAllCallCost(){

		System.out.println("Welcome to All Call Cost Screen.");

		String menu = """
		1-> No ALL Call Cost
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noCost(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noCost(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}
	
	}

	public static void showPrepaidCredit(){

		System.out.println("Welcome to Prepaid Credit Screen.");

		String menu = """
		1-> No Prepaid Credit
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noPrepaid(); break;
			case '2': showCallRegister(); break;
			default: gotoMainMenu();
		}
	}

	public static void noPrepaid(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showCallRegister(); break;
			default: gotoMainMenu();
	
			}

	}

	
	
	public static void showTones(){
		
		System.out.println("Welcome to Tones Screen");

		String menu = """
		1-> Ringing Tone
		2-> Ringing Volume
		3-> Incoming Call Alert
		4-> Composer
		5-> Message Alert Tone
		6-> KeyPad Tones
		7-> Warning and Games Tones
		8-> Vibrating alert
		9-> Screen saver
		A-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered Number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput) {

			case '1': showRingingTone(); break;
			case '2': showRingingVolume(); break;
			case '3': showIncomingCallAlert(); break;
			case '4': showComposer(); break;
			case '5': showMessageAlertTone(); break;
			case '6': showKeypadTones(); break;
			case '7': showWarningAndGamesTones(); break;
			case '8': showVibratingAlert(); break;
			case '9': showScreenSaver(); break;
			case 'A': showMessage(); break;
			default: gotoMainMenu();
			
		}

	}

	public static void showRingingTone(){

		System.out.println("Welcome to Show Ringing Tones Screen.");

		String menu = """
		1-> No Tones
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noTone(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
			}

		}

	public static void noTone(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showRingingVolume(){

		System.out.println("Welcome to Show Ringing Volume Screen.");

		String menu = """
		1-> No Tones Volume
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoToneVolume(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
			}

		}

	public static void showNoToneVolume(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showIncomingCallAlert(){

		System.out.println("Welcome to Show Incoming Call Alert Screen.");

		String menu = """
		1-> No Incoming Call Alert
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoIncomingCallAlert(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoIncomingCallAlert(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showComposer(){

		System.out.println("Welcome to Show Composer Screen.");

		String menu = """
		1-> No Composer
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoComposer(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoComposer(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showMessageAlertTone(){

		System.out.println("Welcome to Show Message Alert Tone Screen.");

		String menu = """
		1-> No Message Alert Tone
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoMessageAlertTone(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoMessageAlertTone(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showKeypadTones(){

		System.out.println("Welcome to Show Keypad Tone Screen.");

		String menu = """
		1-> No Keypad Tone
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoKeypadTone(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoKeypadTone(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showWarningAndGamesTones(){

		System.out.println("Welcome to Show Warning And Games Tone Screen.");

		String menu = """
		1-> No Warning And Games Tone
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoWarningAndGamesTone(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoWarningAndGamesTone(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}

	public static void showVibratingAlert(){

		System.out.println("Welcome to Show Vibrating Alert Screen.");

		String menu = """
		1-> No Vibrating Alert
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoVibratingAlert(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}
	
	public static void showNoVibratingAlert(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	

	}

	public static void showScreenSaver(){

		System.out.println("Welcome to Show Screen Saver Screen.");

		String menu = """
		1-> No Screen Saver
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': showNoScreenSaver(); break;
			case '2': showTones(); break;
			default: gotoMainMenu();
		}
	}

	public static void showNoScreenSaver(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showTones(); break;
			default: gotoMainMenu();
	
			}

	}


		public static void showSettings(){

		System.out.println("Welcome to Settings");

		String menu = """
		1-> Call Settings
		2-> Phone Settings
		3-> Security Settings
		4-> Restore Factory Settings
		5-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput) {

			case '1': showCallSettings(); break;
			case '2': showPhoneSettings(); break;
			case '3': showSecuritySettings(); break;
			case '4': showRestoreFactorySettings(); break;
			case '5': showMessage(); break;
			default: gotoMainMenu();

			}
		}

	public static void showCallSetting(){

		System.out.println("Welcome to Call Settings Screen");

		String menu = """
		1-> Automatic Redial
		2-> Speed Dialling
		3-> Call Waiting Options
		4-> Own Number Sending
		5-> Phone Line In Use
		6-> Automatic Answer
		7-> Main Menu
		""";
		System.out.println(menu);
		System.out.println("Enter preffered Number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput) {

			case '1': showAutomaticRedial(); break;
			case '2': showSpeedDialling(); break;
			case '3': showCallwaitingOptions(); break;
			case '4': showownNumberSending(); break;
			case '5': showPhoneLineInUse(); break;
			case '6': showAutomaticAnswer(); break;
			case '7': showMessage(); break;
			default: gotoMainMenu();

		}
	}

	public static void showAutomaticRedial(){

		System.out.println("Welcome to Show Automatic Redial Screen.");

		String menu = """
		1-> No Automatic Redial
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noAutomaticRedial(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}
	
	public static void noAutomaticRedial(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
		}
	}

	public static void showSpeedDialling(){

		String menu = """
		1-> No Speed Dialling
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noSpeedDial(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}
	
	public static void noSpeedDial(){
	
		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
		}
	}
	
	public static void showCallwaitingOptions(){

		String menu = """
		1-> No Call Waiting Options
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': nocallWaitOption(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}

	public static void nocallWaitOption(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
			
			}
		}

	public static void showownNumberSending(){


		String menu = """
		1-> No Show Own Number Sending
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noShowNumberOwnSend(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}

	public static void noShowNumberOwnSend(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
			
			}
		}

	public static void showPhoneLineInUse(){

		String menu = """
		1-> No Phone Line In Use
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noPhoneLineUse(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}

	public static void noPhoneLineUse(){
	
		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
			
			}
		}

	public static void showAutomaticAnswer(){

		String menu = """
		1-> No Automatic Answer
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noAutomaticAnswer(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		
			}
		}

	public static void noAutomaticAnswer(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
			
		}
	}
	
	public static void showPhoneSettings(){

		System.out.println("Welcome to Phone Settings");

		String menu = """
		1-> Language
		2-> Call Info Display
		3-> Welcome Note
		4-> Network Selection
		5-> Lights
		6-> Confirm Sim Service Actions
		7-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preferred Number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1': showLanguage(); break;
			case '2': showCallInfoDisplay(); break;
			case '3': showWelcomeNote(); break;
			case '4': showNetworkSelection(); break;
			case '5': showLights(); break;
			case '6': showconfirmSimServicesActions(); break;
			case '7': showMessage(); break;
			default: gotoMainMenu();
		}
	}

	public static void showLanguage(){

		String menu = """
		1-> No Language
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noLanguage(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}
	
	public static void noLanguage(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}
			
	public static void showCallInfoDisplay(){

		String menu = """
		1-> No Call Info Display
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noCallInfo(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		}
	}

	public static void noCallInfo(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}

	public static void showWelcomeNote(){

		String menu = """
		1-> No welcome Note
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noWelcomeNote(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
			
		}
	}

	public static void noWelcomeNote(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}
	
	public static void showNetworkSelection(){

		String menu = """
		1-> No Network Selection
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noNetworkSelection(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
			
		}
	}

	public static void noNetworkSelection(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}
	
	public static void showLights(){

		String menu = """
		1-> No Light
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noLight(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();
		
		}
	}

	public static void noLight(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}

	public static void showconfirmSimServicesActions(){

		String menu = """
		1> No Sim Service Action
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noSimServiceAction(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();

			}
		}

	public static void noSimServiceAction(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}

	public static void showSecuritySettings(){

		String menu = """
		1> No SecuritySetting
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noSecuritySetting(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();

		}
	}

	public static void noSecuritySetting(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();

		}
	}

	public static void showRestoreFactorySettings(){

		
		String menu = """
		1> No Restore factory Settings
		2 -> Main menu	
		""";
		

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {
		
			case '1': noFactorySetting(); break;
			case '2': showSettings(); break;
			default: gotoMainMenu();

			}
		}

	public static void noFactorySetting(){

		String menu = """
		1-> Main Menu
		""";
		
		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': showSettings(); break;
			default: gotoMainMenu();
	
		}
	}

	
	public static void showCallDivert(){

		System.out.println("Welcome to Call Divert Screen");

		String menu = """
		1-> Not Call Divert
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noCallDivert(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noCallDivert(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}	
	

	


	public static void showGames(){

		System.out.println("Welcome to Chat Screen");

		String menu = """
		1-> Not Games
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noGames(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noGames(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}

	


	public static void showCalculator(){

		System.out.println("Welcome to Calculator Screen");

		String menu = """
		1-> Not Calculator
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noCalculator(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noCalculator(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}	

	
	


	public static void showReminder(){

		System.out.println("Welcome to Reminder Screen");

		String menu = """
		1-> Not Reminder
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noReminder(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noReminder(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}		


	public static void showProfiles(){

		String menu = """
		1-> Not Profile
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noProfiles(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noProfiles(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}


	public static void showSimServices(){


		String menu = """
		1-> No Sim Service
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noSimServices(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noSimServices(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}		

	public static void showClock(){

	System.out.println("Welcome to Clock Screen");
	
	String menu = """

	1-> Alarm Clock
	2-> Clock Settings
	3-> Date Setting
	4-> StopWatch
	5-> CountDown Timer
	6-> Auto Update Of Time And date
	7-> Main Menu
	""";

	System.out.println(menu);
	System.out.println("Enter preffered Number: ");
	char userInput = input.nextLine().charAt(0);

	switch(userInput) {

		case '1': showAlarmClock(); break;
		case '2': showClockSettings(); break;
		case '3': showDateSetting(); break;
		case '4': showStopwatch(); break;
		case '5': showCountDownTimer(); break;
		case '6': showAutoUpdateOfTimeAndDate(); break;
		case '7': gotoMainMenu(); break;
		default: gotoMainMenu();

		}

	}

	public static void showAlarmClock(){

	

		String menu = """
		1-> No Alarm Clock
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noAlarmClock(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noAlarmClock(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}
	

	public static void showClockSettings(){

		

		String menu = """
		1-> No Clock Settings
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noClockSettings(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noClockSettings(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}


	public static void showDateSetting(){

		

		String menu = """
		1-> No Date Settings
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noDateSettings(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noDateSettings(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}


	public static void showStopwatch(){

		

		String menu = """
		1-> No Stop Watch
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noStopWatch(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noStopWatch(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}


	public static void showCountDownTimer(){

		

		String menu = """
		1-> No Count Down Timer
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noCountDownTimer(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noCountDownTimer(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}
		}


	public static void showAutoUpdateOfTimeAndDate(){

		

		String menu = """
		1-> No Auto Update Of Time And Date
		2-> Main menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0);

		switch(userInput){
		
			case '1' : noAutoUpdateOfTimeAndDate(); break;
			case '2' : gotoMainMenu(); break;
			default : gotoMainMenu();

		}
	}

	public static void noAutoUpdateOfTimeAndDate(){

		String menu = """
		1-> Main Menu
		""";

		System.out.println(menu);
		System.out.println("Enter preffered number: ");
		char userInput = input.nextLine().charAt(0); 
		
		switch(userInput) {

			case '1': gotoMainMenu(); break;
			default: gotoMainMenu();
	
			}

		}


	 

}