package Brainteaser;

public class Bulb_Switcher {
    public int bulbSwitch(int n) {
        int res = 1;
        while(res * res <= n){
        	res++;
        }
        return res - 1;
    }
}
