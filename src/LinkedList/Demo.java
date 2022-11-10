package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placedToVisit = new LinkedList<String>();
        addInOrder(placedToVisit, "Sydney");
        addInOrder(placedToVisit, "Melbourne");
        addInOrder(placedToVisit, "Brisbane");
        addInOrder(placedToVisit, "Perth");
        addInOrder(placedToVisit, "Canberra");
        addInOrder(placedToVisit, "Adelaide");
        addInOrder(placedToVisit, "Darvin");
        printList(placedToVisit);
        addInOrder(placedToVisit, "Alice Springs");
        addInOrder(placedToVisit, "Darvin");
        printList(placedToVisit);
        visit(placedToVisit);
        /*placedToVisit.add("Sydney");
        placedToVisit.add("Melbourne");
        placedToVisit.add("Brisbane");
        placedToVisit.add("Perth");
        placedToVisit.add("Canberra");
        placedToVisit.add("Adelaide");
        placedToVisit.add("Darvin");*/

        /*printList(placedToVisit);

        placedToVisit.add(1, "Alice Springs");
        printList(placedToVisit);

        placedToVisit.remove(4);
        printList(placedToVisit);*/
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting:" + i.next());
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equals, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities to");
        } else{
            System.out.println("Now visiting: " + listIterator.next());
        }
        while (!quit) {

            while (!quit) {
                int action = scanner.nextInt();
                scanner.nextInt();
                switch (action) {
                    case 0:
                        System.out.println("Holiday (Vacation) over");
                        quit = true;
                        break;
                    case 1:
                        if (listIterator.hasNext()) {
                            System.out.println("Now visiting " + listIterator.next());
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                        break;
                    case 2:
                        if(listIterator.hasPrevious()){
                            System.out.println("Now visiting: " + listIterator.previous());
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                        break;
                        case 3 :
                            printMenu();
                            break;
                }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit \n" +
                            "1 - go to next city \n" +
                            "2 - go to previous city" +
                            "3 - print menu options");
    }
}
