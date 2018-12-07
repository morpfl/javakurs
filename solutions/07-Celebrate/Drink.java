public abstract class Drink {

    private boolean isEmpty;
    private String name;

    public Drink(String name){
        this.isEmpty = false;
        this.name =  name;
    }

    // man kann nur nicht-leere Getränke austrinken
    public boolean drink(){
        if(!this.isEmpty){
            this.isEmpty = true;
            return true;
        }
        return false;
    }

    public boolean getIsEmpty(){ return this.isEmpty; }


    public String toString(){
        return this.name;
    }

}
