package Jobsheet2.Percobaan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim = "254107020191";
        mhs1.nama="Najwa";
        mhs1.alamat="Jl Semanggi Barat";
        mhs1.kelas="2D";
        mhs1.tampilBiodata();

        Mahasiswa mhs2=new Mahasiswa();
        mhs2.nim = "25410702008";
        mhs2.nama="Salbil";
        mhs2.alamat="Jl. Semanggi Barat";
        mhs2.kelas="2D";
        mhs2.tampilBiodata();

        Mahasiswa mhs3=new Mahasiswa();
        mhs3.nim = "254107020172";
        mhs3.nama="Bebe";
        mhs3.alamat="Jl Bougenville";
        mhs3.kelas="2G";
        mhs3.tampilBiodata();
    }
    
}