package com.atmchecker;

public class Atm {
	private String atm_number;
	private String result;
	public String getAtm_number() {
		return atm_number;
	}
	public void setAtm_number(String atm_number) {
		this.atm_number = atm_number;
	}

    public String getResult() {

        int[] ints = new int[atm_number.length()];
        for (int i = 0; i < atm_number.length(); i++) {
            ints[i] = Integer.parseInt(atm_number.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            return (atm_number + " is a valid atm card number");
        } 
        return (atm_number + " is an invalid atm card number");
        

    }

}
