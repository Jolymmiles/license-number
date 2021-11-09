
package test;

public enum enumLicense {
    Moscow(77, 97, 99, 177, 199, 197, 777, 797, 799), SaintPeterburg(78, 98, 178, 198);

    private Integer[] digitArray;
    enumLicense(Integer... digitArray) {
        this.digitArray = digitArray;
    }

    public Integer[] getDigitArray() {
        return digitArray;
    }
}

