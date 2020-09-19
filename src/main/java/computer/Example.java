package computer;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {

        Computer fullComputer = new Computer(new GraphicCard(new Chip("NVidia")));
        Computer noGraphicCardComputer = new Computer(null);
        Computer fake = null;

        printVendorSafeWay(fullComputer);
        printVendorSafeWay(noGraphicCardComputer);
        printVendorSafeWay(fake);

        printChipVendorNaive(fullComputer);
        printChipVendorNaive(noGraphicCardComputer);
        printChipVendorNaive(fake);
    }


    static void printChipVendorNaive(Computer computer){
        System.out.println( computer.getGraphicCard().getChip().getVendor());
    }


    static void printChipVendorNameWithOptional(Computer computer){
        Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicCard()) //zamieniamy komputer na kartę graficzną...
                .map(graphicCard -> graphicCard.getChip())
                .map(chip -> chip.getVendor())
                .ifPresent(s -> System.out.println("Vendor (Optional): " + s));
    }


    static void printVendorSafeWay(Computer computer){
        if (computer != null){
            GraphicCard graphicCard = computer.getGraphicCard();
            if (graphicCard != null) {
                Chip chip = graphicCard.getChip();
                if (chip!=null){
                    System.out.println("Safe way graphic card: " + chip.getVendor());
                }
            }
        }
    }
}
