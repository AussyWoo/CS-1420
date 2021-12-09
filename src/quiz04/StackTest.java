package quiz04;

public class StackTest {
    public static void main (String[] args) {
        System.out.println("hi");
        //First stack
        StackOfBoxes stack1 = new StackOfBoxes();

        //Create three new Boxes
        Box a = new Box("Hello");
        Box b = new Box("Hi");
        Box c = new Box("Howdy");

        //Add the Boxes to Stack 1
        stack1.addBox(a);
        stack1.addBox(b);
        stack1.addBox(c);

        //Remove and print out the top of Stack 1
        System.out.println(stack1.removeBox().getObject()); //Should print "Howdy".

        //Stack 1 should now be, from top to bottom: b, a

        //Create two new Boxes
        Box d = new Box("Hey");
        Box e = new Box("Hiya");

        //Add the Boxes to Stack 1
        stack1.addBox(d);
        stack1.addBox(e); //Stack 1 should now be, from top to bottom: e,d,b,a

        //Remove all four Boxes and print their objects
        System.out.println(stack1.removeBox().getObject()); //Should print "Hiya".
        System.out.println(stack1.removeBox().getObject()); //Should print "Hey".
        System.out.println(stack1.removeBox().getObject()); //Should print "Hi".
        System.out.println(stack1.removeBox().getObject()); //Should print "Hello".

        //Second stack
        StackOfBoxes stack2 = new StackOfBoxes();

        //Add 203 boxes to Stack 2
        for(int i = 0; i < 203; i++) {
            stack2.addBox(new Box("placeholder"));
        }

        //Print out height of Stack 2
        System.out.println("The height of the second stack is: " + stack2.getHeight());
    }
}
