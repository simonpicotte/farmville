import java.util.ArrayList;

public class MyFarm {
    ArrayList<Plot> row;
    public Plot chloePlot;

    public static void main(String[] args) {
        //System.out.println("this is my farm");
        MyFarm LettuceCode = new MyFarm();
    }

    public MyFarm() {
        row = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
        //totalPlants();
        //printPlantNames();
        //printRowInfo();
        //addLettuce();
        //addTulip();
        //tomatoLocations();
        //totalCarrots();
        //averageNumberOfPlants();
        //numberOfCarrotPlots();
        //everyOtherNeedsWater();
        //greaterThan10();
        plantWithMaxNumber();
        //plantWithMinNumber();
        //plantWithMaxNumberNeedsWater();

    }

    public void totalPlants() {
        int total = 0;
        // how many total plants are there in the row?

        System.out.println("***TOTAL PLANTS***");
        for (int s = 0; s < row.size(); s++) {
            total = total * row.get(s).numberOfPlants;
        }
        System.out.println("total  plants in a row: " + total);
    }

    public void printPlantNames() {
        System.out.println("***PLANT NAMES***");
        for (int i = 0; i < row.size(); i++) {
            System.out.println(i + ": " + row.get(i).plantName + ", ");
        }
    }

    public void printRowInfo() {
        System.out.println("***ROW INFO***");
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
    }

    public void addLettuce() {
        System.out.println("******ADD LETTUCE*******");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantNames();


    }
    public void addTulip() {
        System.out.println("******ADD TULIP*******");
        printPlantNames();
        row.get(3).plantName = "tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantNames();



        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
    }
    public void tomatoLocations () {
        System.out.println("******ALL TOMATO*******");
        printPlantNames();
        numberOfEmptyPlots();
        if(row.isEmpty())
            printPlantNames();




        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
    }
    public void totalCarrots () {
        System.out.println("******TOTAL CARROT*******");
        int total=0;

        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName==("carrot")){
                total=total+row.get(k).numberOfPlants;
            }
        }
        System.out.println("Total Carrots: " + total);



        // how many total carrot plants are there?
    }
    public void averageNumberOfPlants () {
        System.out.println("******AVERAGE*******");
       int total=0;
       int avg=0;
       for(int index=0;index< row.size();index++){
           total=total+row.get(index).numberOfPlants;
       }
       avg=total/10;
        System.out.println("Average equals: "+avg);


        // what is the average number of plants across the whole row?
    }
    public void numberOfCarrotPlots(){
        System.out.println("******TOTAL CARROT PLOTS*******");
        int total=0;

        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName==("carrot")){
                total=total+1;;
            }
        }
        System.out.println("number of carrot plots: " + total);

    }
    public void numberOfEmptyPlots () {
        int total = 0;
        System.out.println("******Total Empty*******");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;

        }
        System.out.println("total plants in row" + total);

}
    public void everyOtherNeedsWater(){
        System.out.println("****EVERY OTHER PLANT NEEDS WATER****");

        for(int k=0;k<row.size();k+=2){
            row.get(k).needsWater=true;

            }



    }



    public void greaterThan10() {
        int total = 0;
        System.out.println("***PLOTS > 10***");
        for (int s = 0; s < row.size(); s++) {
            if(row.get(s).numberOfPlants>10){
                total=total+1;;
            }
        }
        System.out.println("There are " + total + " plots which have more than 10 plants");


        // how many plots have more than 10 plants in the plot?


    }
    public void plantWithMaxNumber() {
        int numTomatoPlants = 0;
        int numTulipPlants = 0;
        int numLettucePlants = 0;
        int numCarrotPlants = 0;
        int numEmptyPlants = 0;
        String typeMostPlants = "nothing";
        for (int i=0; i < row.size(); i++) {
            if (row.get(i).plantName == "carrot") {
                numCarrotPlants += row.get(i).numberOfPlants;
                if (numCarrotPlants > numTomatoPlants && numCarrotPlants > numTulipPlants && numCarrotPlants > numLettucePlants && numCarrotPlants > numEmptyPlants) {
                    typeMostPlants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "tulip") {
                numTulipPlants += row.get(i).numberOfPlants;
                if (numTulipPlants > numTomatoPlants && numTulipPlants > numCarrotPlants && numTulipPlants > numLettucePlants && numTulipPlants > numEmptyPlants) {
                    typeMostPlants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "tomato") {
                numTomatoPlants += row.get(i).numberOfPlants;
                if (numTomatoPlants > numCarrotPlants && numTomatoPlants > numTulipPlants && numTomatoPlants > numLettucePlants && numTomatoPlants > numEmptyPlants) {
                    typeMostPlants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "lettuce") {
                numLettucePlants += row.get(i).numberOfPlants;
                if (numLettucePlants > numTomatoPlants && numLettucePlants > numTulipPlants && numLettucePlants > numCarrotPlants && numLettucePlants > numEmptyPlants) {
                    typeMostPlants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "empty") {
                numEmptyPlants += row.get(i).numberOfPlants;
                if (numEmptyPlants > numTomatoPlants && numEmptyPlants > numTulipPlants && numEmptyPlants > numLettucePlants && numEmptyPlants > numCarrotPlants) {
                    typeMostPlants = row.get(i).plantName;
                }
            }
        }
        System.out.println("The plant type with the most plants is " + typeMostPlants);
    }

        // which plant type has the most total plants?




    public void plantWithMinNumber() {
        System.out.println("***PLANT WITH MIN NUMBER***");
        int totalCarrots =0;
        int totalTomatoes =0;
        int totalTulips =0;
        int totalLettuce =0;
        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName == "carrot"){
                totalCarrots=totalCarrots+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName == "tomato"){
                totalTomatoes=totalTomatoes+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName == "tulip"){
                totalTulips=totalTulips+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName == "lettuce"){
                totalLettuce=totalLettuce+row.get(k).numberOfPlants;
            }
        }
        int currentMin=1;
        String plantType="empty";

        if(totalCarrots<totalTomatoes && totalCarrots>0){
            currentMin=totalCarrots;
            plantType="carrot";
        } else if(totalCarrots>totalTomatoes && totalTomatoes>0){
            currentMin=totalTomatoes;
            plantType="tomato";
        }
        if(totalTulips<currentMin && totalTulips>0){
            currentMin=totalTulips;
            plantType="tulip";
        }
        if(totalLettuce<currentMin && totalLettuce>0){
            currentMin=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("The min plant type is: " +plantType+ " with "+ currentMin+ " plants.");
    }

        // which plant type has the least total plants (not counting empty plots)?





    public void plantWithMaxNumberNeedsWater(){
            // which plant type has the most total plants (not counting empty plots) that needs water?
            printRowInfo();
            int carrot=0;
            int tulip=0;
            int lettuce=0;
            int tomato=0;
            int mostPlants=0;
            for (int i=0;i<row.size();i++) {
                if (row.get(i).plantName == "carrot" && row.get(i).needsWater==true) {
                    carrot+=1;
                } else if (row.get(i).plantName == "tulip" && row.get(i).needsWater==true) {
                    tulip+=1;
                } else if (row.get(i).plantName == "lettuce" && row.get(i).needsWater==true) {
                    lettuce+=1;
                } else if (row.get(i).plantName == "tomato" && row.get(i).needsWater==true) {
                    tomato+=1;
                }
            }
            if (carrot>tulip && carrot>lettuce && carrot>tomato){
                System.out.println("carrots");
            }else if (tulip>carrot && tulip>lettuce && tulip>tomato){
                System.out.println("tulips");
            }else if (lettuce>tulip && lettuce>carrot && lettuce>tomato){
                System.out.println("lettuce");
            }else if (tomato>tulip && tomato>lettuce && tomato>carrot){
                System.out.println("tomatoes");
            }
        }
        // which plant type has the most total plants (not counting empty plots) that needs water?



    }


