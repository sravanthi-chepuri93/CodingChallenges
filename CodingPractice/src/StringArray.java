class Program3{
    public boolean checkIfFruitExists(String[] fruitsArray, String fruit){
        if (fruit == null || fruitsArray == null|| fruit.isEmpty()|| fruitsArray.length ==0){
            return  false;
        }

        for (String s : fruitsArray) {
            if (s.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

}

public class StringArray {
    public static void main(String[] args){
        Program3 fruits = new Program3();
        String[] fruitsArr = {};
        String fruit =null ;
        boolean exists = fruits.checkIfFruitExists(fruitsArr, fruit);
        System.out.println(exists);
    }
}
