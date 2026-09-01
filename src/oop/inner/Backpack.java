package oop.inner;

public class Backpack {
    static String size;
    public Backpack(){
    }
    public Backpack(String size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "size='" + size + '\'' +
                '}';
    }

    public static class Personal{
        String purpose;
        public Personal(){
        }
        public Personal(String purpose){

            this.purpose = purpose;
        }
        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        @Override
        public String toString() {
            return "Personal{" +size+
                    "purpose='" + purpose + '\'' +
                    '}';
        }
    }
}
