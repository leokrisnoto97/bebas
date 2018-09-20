package fungsi_perkalian;

class kontrol {

    public int perkalian(int a, int b) {
        int jumlah = 0;
        jumlah = a * b;
        return jumlah;
    }

    public int perkalian_looping(int a, int b) {
        int jumlah = 0;
        if (a < 0 && b < 0) {
            int c = a * -1;
            int d = b * -1;
            jumlah = perulangankali(d, c);
        } else if (a > 0 && b > 0) {
            jumlah = perulangankali( b, a);
        } else if (a > 0 && b < 0) {
            int c = a * -1;
            int d = b * -1;
            jumlah = perulangankali(d, c);
        } else if (a < 0 && b > 0) {
            jumlah = perulangankali(b, a);
        }
        return jumlah;
    }

    public int perulangankali( int x, int y) {
        int jumlah =0;
        for (int i = 0; i < x; i++) {
            jumlah = jumlah + y;
        }
        return jumlah;
    }
  
}
