package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class License {
    private String lisenceNum;
    private LicenseConst region;

    public License(String lisenceNum) {
        if (!checkLicense(lisenceNum)) {
            throw new IllegalArgumentException("Такого номера не существует.");
        }
        this.lisenceNum = lisenceNum;
        this.region = findRegion();
    }

    public static boolean checkLicense(String num) {
        return num.matches("[АВЕКМНОРСТУХ]{1}[0123456789]{3}[АВЕКМНОРСТУХ]{2}[0123456789]{2}");
    }

    //Получение региона машины
    private LicenseConst findRegion() {
        String regionNum = this.lisenceNum.substring(6);
        List<LicenseConst> regArray = new ArrayList<LicenseConst>(Arrays.asList(LicenseConst.values()));
        for (LicenseConst regionInArray : regArray) {
            List<Integer> numArray = new ArrayList<Integer>(Arrays.asList(regionInArray.getDigitArray()));
            if (numArray.contains(Integer.parseInt(regionNum))) {
                return regionInArray;
            }
        }
        return null;
    }

    public String getLisenceNum() {
        return lisenceNum;
    }

    public LicenseConst getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Гос. номер: " + lisenceNum + ", Регион: " + region;
    }
}
