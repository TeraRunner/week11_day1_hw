public class Printer {

    public int sheetsNumber;
    public int toner;

    public Printer(int sheetsNumber, int toner){
        this.sheetsNumber = sheetsNumber;
        this.toner = toner;
    }

    public int print(int pagesToPrint, int copies){
        return this.sheetsNumber -= (copies * pagesToPrint);
    }

    public int printToner(int pagesToPrint, int copies) {
        return this.toner -= (copies * pagesToPrint);
    }

    public String canPrint(int pagesToPrint, int copies) {
        if (this.sheetsNumber == 0) {
            return "Not enough paper!";
        } else if ((copies * pagesToPrint) >= sheetsNumber) {
            return "You are going to run out of paper before finish";
        } else {
            return "Everything went ok!";
        }
    }

    public int refill(int paper) {
        return this.sheetsNumber += paper;
    }

}

//Create a Printer class that has a property for number of sheets of
// paper left.
//Add a method to print that takes in a number of pages and number of
// copies.
//The print method will only run if the printer has enough paper. If it
// runs it will reduce the value of the paper left by number of copies
// * number of pages.
//Create a method to refill the printer paper.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page
// printed.