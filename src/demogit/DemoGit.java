package demogit;

import util.MyToys;

public class DemoGit {
    public static void main(String[] args){
        System.out.println("5! = " + MyToys.cF(5));  //expected 120
        System.out.println("6! = " + MyToys.cF(6));  //expected 720
        System.out.println("0! = " + MyToys.cF(0));  //expected 1
        System.out.println("-5! = " + MyToys.cF(-5)); //expected error
        
    }
}
