//ChristianYoung, CSC 130, 10/24/22

package Main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LinkedList {

    Node head = null;
    Node tail = null;

     class Entry {
    	 
    	 public String Key;
    	 public String value;
    	 
     }
      
     class Node {                                          //creating the Node class inside the LinkedList class so that it will be accessible later

        public Entry value;
        public Node next;
    
        public Node(Entry v) {                            //declaring value and next to the constructor to use later
            value = v;
            next = null;
        }
        
        boolean contains(Entry value) {
            if (this.value == value) {                     //If the variable is found, method returns true
                return true;                               //Otherwise, it recursively searches until the
            }                                              //value is found. If nothing it found it will
            else if (head == null) {                       //return false.
                return false;
            }
            else if (this.next == null) {
            	return false;
            }
            else {
                return this.next.contains(value);
            }
        }

        void print() {                                     //loops with recursion
                                                           //prints out the value of the list the program currently sees
                                                           //gets the next value ready
        	if ((head.equals(null) && tail.equals(null))) {            //and the recursively loops the method until it reaches a null point
        		//System.out.println("There is nothing else to print");
        		return;
        	}	
        	else if (!(this.value.equals(null))) {
        		System.out.println(this.value.Key + "," + this.value.value);
        		if(this.next != null) {
        			next.print();
        		}
        	}
        	else {
 
        	}  

        	}
        }
     
    
   public static void main(String[] args) {  //Main method
        // about();
        //listTest10();
    	LinkedList Main = new LinkedList();
    	LinkedList.Entry access = Main.new Entry();  //Declares the main linked list to use Entry
    	
    	try {
			File fileData = new File("areacode.txt");
			Scanner kb = new Scanner(fileData);

			LinkedList Bucket0 = new LinkedList();  //Sorry
			LinkedList Bucket1 = new LinkedList();              
			LinkedList Bucket2 = new LinkedList();      
			LinkedList Bucket3 = new LinkedList(); 
			LinkedList Bucket4 = new LinkedList();
			LinkedList Bucket5 = new LinkedList();
			LinkedList Bucket6 = new LinkedList();
			LinkedList Bucket7 = new LinkedList();
			LinkedList Bucket8 = new LinkedList();
			LinkedList Bucket9 = new LinkedList();

			String str = kb.nextLine();
			int digits = Integer.parseInt(str);
			System.out.println(digits);  //Prints out and reads the first line to use as a digit variable later
		
			while (kb.hasNext()) {  //radix is outside the while loop
				String y = kb.nextLine();
				
				if (y.equals("END")) { //Ends While Loop if "END" line is reached
					break;
				}
				
				access = solveIndex(y); //Parses Lines of txt with "," using method below
				Main.addTail(access); //Adds Key-Value Pair to Main list as a Tail
			}
			int j = 1;
			for (int i = 0; i < digits; i++) { //Amount of digits needed for loop
				while (Main.isEmpty() != true) {
					char help = Main.head.value.Key.charAt(digits - j);  //Grabs character of 1's digit, then 10's, etc
					switch (help) {  //Bucket Sort part
					case 48:
						if (help == 48) {
							Bucket0.addTail(Main.removeHead());  //Removing from Main to add into Bucket queue
						}
					case 49:
						if (help == 49) {
							Bucket1.addTail(Main.removeHead());
						}
					case 50:
						if (help == 50) {
							Bucket2.addTail(Main.removeHead());
						}
					case 51:
						if (help == 51) {
							Bucket3.addTail(Main.removeHead());
						}
					case 52:
						if (help == 52) {
							Bucket4.addTail(Main.removeHead());
						}
					case 53:
						if (help == 53) {
							Bucket5.addTail(Main.removeHead());
						}
					case 54:
						if (help == 54) {
							Bucket6.addTail(Main.removeHead());
						}
					case 55:
						if (help == 55) {
							Bucket7.addTail(Main.removeHead());
						}
					case 56:
						if (help == 56) {
							Bucket8.addTail(Main.removeHead());
						}
					case 57:
						if (help == 57) {
							Bucket9.addTail(Main.removeHead());
						}
					}
				}
				j++;
			
			for (;Bucket0.isEmpty() != true;) {
				Main.addTail(Bucket0.removeHead()); //Each For Loop adds to the Main Linked List from each Bucket0-9
			}
			
			for (;Bucket1.isEmpty() != true;) {
				Main.addTail(Bucket1.removeHead());
			} 
			
			for (;Bucket2.isEmpty() != true;) {
				Main.addTail(Bucket2.removeHead());
			} 
			
			for (;Bucket3.isEmpty() != true;) {
				Main.addTail(Bucket3.removeHead());
			} 
			
			for (;Bucket4.isEmpty() != true;) {
				Main.addTail(Bucket4.removeHead());
			} 
			
			for (;Bucket5.isEmpty() != true;) {
				Main.addTail(Bucket5.removeHead());
			} 
			
			for (;Bucket6.isEmpty() != true;) {
				Main.addTail(Bucket6.removeHead());
			} 
			
			for (;Bucket7.isEmpty() != true;) {
				Main.addTail(Bucket7.removeHead());
			} 
			
			for (;Bucket8.isEmpty() != true;) {
				Main.addTail(Bucket8.removeHead());
			} 
			
			for (;Bucket9.isEmpty() != true;) {
				Main.addTail(Bucket9.removeHead());
			} 
		}
        kb.close();
    	} catch (FileNotFoundException e) {
    		System.out.println("FileNotFound Exception");
			e.printStackTrace();
		}
    Main.print();  //Prints out Main Linked List to Terminal
    System.out.println("END");  //Iterated last line for END
    } 
   
   	public static Entry solveIndex(String x) {  //Parses each line into two String arrays Key-Value delimited with ","
   		LinkedList encompass = new LinkedList();
    	LinkedList.Entry fixIndex = encompass.new Entry();
		String[] split = x.split(",");
	    fixIndex.Key = split[0];
	    fixIndex.value = split[1];
		return fixIndex;
   	}
   	
  /* public static void listTest10() {                      //test 10
    	var in = new LinkedList();
    	System.out.println("Starting test...");
    	in.addHead("final");
    	in.removeHead();
    	in.addTail("Tail");
    	in.addHead("Head");
    	in.addHead("Head2");
    	in.addHead("Head3");
    	in.addTail("Tail2");
    	in.print();
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    } */
    
   /* public static void about() {                         //An about section describing me
        System.out.println("Hi my name is Christian Young. I am a junior as a CS major that switched from CPE.\n");
    } */

    void addHead(Entry value) {
        Node add = new Node(value);
        //System.out.println("Adding a new head...");

        if (head == null) {                              //adds a head and tail link to the same node if there is only one
            head = add;
            tail = add;
        }
        else {
            add.next = head;                             //with multiple nodes, it will add a head node to the desired value
            head = add;
        }
    }

    void addTail(Entry value) {
        Node add = new Node(value);
        //System.out.println("Adding a new tail...");

        if (isEmpty() || tail == null) {                              //adds a head and tail link to the same node if there is only one
            head = add;
            tail = add;
        }
        else {
        	tail.next = add;                             //with multiple nodes, it will add a tail node to the desired value
            tail = add;
        }
    }

    Entry removeHead() {
    	Entry result = head.value;
    	head = head.next;
        //System.out.println("Removing the head...");

        if (head == null) {                             //This method removes the head if it doesn't read a null head value.
            tail = null;                                //If the head is null, it will null the tail reference as well as writing a line
        }
        else if (tail != null) {
            tail = null;
        }
        return result;
    }

    Entry peekHead() {
        if (head != null) {
            return head.value;
        }                                               //If the head is not null, it returns the value
        else {                                          //of the head. Otherwise, it returns a string saying
            return null;             //the list is empty
        } 
    } 

    boolean isEmpty() {
        if (head == null) {
            return true;                                //Simply returns if the list is empty or not
        }
        else {
            return false;
        }
    }
    
    boolean contains(Entry value) {
    	return head.contains(value);                    //Calling the contains method from Node into the LinkedList class
    }
    
    void print() {                                      //Calling the print method from Node into the LinkedList class

    	if (head.equals(null)) {
    		System.out.println("There is nothing to currently print...\n"); //Catches an error if it tries to print an empty list
    		return;
    	}
    	else {
    		//System.out.println("Printing the list: ");

    		head.print();
    	}
    }

}