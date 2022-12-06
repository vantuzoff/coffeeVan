package Classes;
import Receivers.*;
public class Invoker {
    Order order;
    Command sortAmount;
    Command sortPrice;
    Command chooseCoffeeSpecies;
    Command chooseCoffeeType;
    Command chooseVolume;
    Command chooseCustomVolume;

    Command chooseBrand;

    public Invoker(Order fst){
        order = fst;
        sortAmount = new AmountSort(order);
        sortPrice = new PriceSort(order);
        chooseCoffeeSpecies = new SpeciesChooser(order);
        chooseCoffeeType = new TypeChooser(order);
        chooseVolume = new VolumeChooser(order);
        chooseCustomVolume = new CustomVolumeChooser(order);
        chooseBrand = new chooseBrand(order);
    }

    public void sortAm(){
        sortAmount.execute();
    }

    public void sortPr(){
        sortPrice.execute();
    }
    public void chooseSp(){
        chooseCoffeeSpecies.execute();
    }
    public void chooseType(){
        chooseCoffeeType.execute();
    }
    public void chooseVol(){
        chooseVolume.execute();
    }
    public void chooseCustVol(){chooseCustomVolume.execute();}
    public void chooseBr(){chooseBrand.execute();}

}
