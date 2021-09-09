package id.t12uetatay.konversi_bilangan

class Operasi {

    fun binToDec(num : String) : String {
        return Integer.parseInt(num, 2).toString()
    }

    fun binToOktal(num : String) : String {
        return Integer.toOctalString(Integer.parseInt(num, 2))
    }

    fun binToHex(num : String) : String {
        return Integer.toHexString(Integer.parseInt(num, 2)).toUpperCase()
    }

    // Decimal to...
    fun decToBin(num : String) : String {
        return Integer.toBinaryString(Integer.parseInt(num))
    }

    fun decToOktal(num : String) : String {
        return Integer.toOctalString(Integer.parseInt(num))
    }

    fun decToHex(num : String) : String {
        return Integer.toHexString(Integer.parseInt(num)).toUpperCase()
    }

    //oktal to....
    fun oktalToBin(num : String) : String {
        return Integer.toBinaryString(Integer.parseInt(num, 8))
    }

    fun oktalToDec(num : String) : String {
        return Integer.parseInt(num, 8).toString()
    }

    fun oktalToHex(num : String) : String {
        return Integer.toHexString(Integer.parseInt(num, 8)).toUpperCase()
    }

    //Hexa to...
    fun hexToBin(num : String) : String {
        return Integer.toBinaryString(Integer.parseInt(num, 16))
    }

    fun hexToDec(num : String) : String {
        return Integer.parseInt(num, 16).toString()
    }

    fun hexToOktal(num : String) : String {
        return Integer.toOctalString(Integer.parseInt(num, 16))
    }

}