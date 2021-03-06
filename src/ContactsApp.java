import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import util.FileHandler;
import util.Input;

import java.util.List;

public class ContactsApp {
    public static void main(String[] args) {
        Input input = new Input();
        FileHandler fHandler = new FileHandler("data", "contacts.txt");
        List<String> contacts = fHandler.retrieveFileContents();

        do {
            mainMenu();
            int option = input.getInt("Enter an option (1, 2, 3, 4, or 5): ", 1, 5);

            switch (option) {
                case (1):
                    viewContacts(contacts);
                    break;
                case (2):
                    addContact(contacts);
                    break;
                case (3):
                    searchContact(contacts);
                    break;
                case (4):
                    deleteContact(contacts);
                    break;
                case (5):
                    System.exit(0);
                default:
                    break;
            }
        } while (input.yesOrNo("Would like to continue? Y/N"));
        System.out.println("Laterz.");
        fHandler.writeToFile(contacts);
    }

    public static void mainMenu(){
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
    }

    public static void viewContacts(List<String> contacts){
        System.out.println("Your Contacts.");
        System.out.println("Name | Phone number ");
        System.out.println("--------------------");

        for(String contact : contacts){
            System.out.println(contact);
        }
    }

    public static void addContact(List<String> contacts){
        Input input = new Input();
        System.out.println("Enter the name of your contact: ");
        String name = input.getString();
        System.out.println("Enter the contact's phone number: ");
        String phoneNumber = input.getString();
        if (phoneNumber.length() == 7){
            phoneNumber = phoneNumber.substring (0, 3) + "-" + phoneNumber.substring(3);
        } else if (phoneNumber.length() == 10){
            phoneNumber = "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6);
        }

        contacts.add(name + " | " + phoneNumber);
        System.out.println(name + " | " + phoneNumber);

    }

    public static void searchContact(List<String> contacts){
        Input input = new Input();
        System.out.println("Enter contact name to search: ");
        String name = input.getString();

        for(String contact : contacts){
            if(contact.contains(name)){
                System.out.println(contact);
            }
        }
    }

    public static void deleteContact(List<String> contacts){
        Input input = new Input();
        System.out.println("Enter the name of your contact that you want to delete.");
        String name = input.getString();

        contacts.removeIf(contact -> {
            if (contact.contains(name) && input.yesOrNo("Delete " + contact + ", Y/N?")) {
                System.out.println("That contact " + contact + " has been removed.");
                return true;
            } else {
                return false;
            }
        });
    }
}
