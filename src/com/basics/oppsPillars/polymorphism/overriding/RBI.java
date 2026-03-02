package com.basics.oppsPillars.polymorphism.overriding;

public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICIC extends  RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }
}
class Canara extends  RBI{
    @Override
    double rateOfInterest(){
        return 7.9;
    }

    static void main() {
        RBI rbi = new RBI();
        HDFC hdfc = new HDFC();
        ICIC icic = new ICIC();
        Canara canara = new Canara();

        System.out.println(" The ROI of RBI is: " + rbi.rateOfInterest()+ "%");
        System.out.println(" The ROI of ICIC : " + icic.rateOfInterest()+ "%");
        System.out.println(" The ROI of HDFC is: " + hdfc.rateOfInterest()+ "%");
        System.out.println(" The ROI of CANARA is: " + canara.rateOfInterest()+ "%");
    }
}

