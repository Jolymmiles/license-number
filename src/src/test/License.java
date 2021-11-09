package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class License {
    private String lisenceNum;
    private enumLicense region;

    public License(String lisenceNum) {
        if (!checkLicense(lisenceNum)) {
            throw new IllegalArgumentException("Такого номера не существует.");
        }
        this.lisenceNum = lisenceNum;
        this.region = getRegion();
    }

    public static boolean checkLicense(String num) {
        return num.matches("[АВЕКМНОРСТУХ]{2}[0123456789]{3}[АВЕКМНОРСТУХ][0123456789]{2}");
    }

    private enumLicense getRegion() {
        String regionNum = this.lisenceNum.substring(6);
        List<enumLicense> regArray = new ArrayList<enumLicense>(Arrays.asList(enumLicense.values()));
        for (enumLicense regionInArray : regArray) {
            List<Integer> numArray = new ArrayList<Integer>(Arrays.asList(regionInArray.getDigitArray()));
            if (numArray.contains(Integer.parseInt(regionNum))) {
                return regionInArray;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "License{" +
                "lisenceNum='" + lisenceNum + '\'' +
                ", region=" + region +
                '}';
    }
}
