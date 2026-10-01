public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int actualMinutesInOven){
        // Metodu çağırmak için () ekledik
        return expectedMinutesInOven() - actualMinutesInOven ;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * 2 ;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven){
        // Hazırlık süresini hesaplayan metodu çağırıp, fırında geçen süreyi ekliyoruz
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven ;
    }
}
