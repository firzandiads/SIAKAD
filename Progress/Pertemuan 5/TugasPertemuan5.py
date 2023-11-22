print();
print("Biodata Diri."            );
print();
print("Masukkan data anda dengan benar!");
print();
nDepan      = input("Nama Depan     : ");
nBelakang   = input("Nama Belakang  : ");
nim         = input("NIM            : ");
pStudi      = input("Program Studi  : ");
fakultas    = input("Fakultas       : ");
thnMasuk    = input("Tahun Masuk    : ");
thnLulus    = input("Tahun Lulus    : ");
ipk         = input("IPK            : ");
print();

lamaStudi = int(thnLulus) - int(thnMasuk) + 1

print("          Kartu Hasil Studi:           ");
print("Nama Lengkap    : " + nDepan + " " + nBelakang);
print("NIM             : " + nim);
print("Program Studi   : " + pStudi);
print("Fakultas        : " + fakultas);
print("IPK             : " + ipk);
print("Lama Studi      : " + str(lamaStudi) + " tahun")

#program if, else, elif
if (float(ipk) > 4.00 or float(ipk) < 0) :
    print("Predikat Lulus  : Tidak Valid");
    print("======================================");
elif (float(ipk) >= 3.51 and int(lamaStudi) <= 4) :
    print("Predikat Lulus  : Dengan Pujian Tertinggi (Summa Cumlaude)");
    print("======================================");
elif (float(ipk) >= 3.51) :
    print("Predikat Lulus  : Dengan Pujian (Cumlaude)");
    print("======================================");
elif (float(ipk) >= 3.01 and float(ipk) < 3.51) :
    print("Predikat Lulus  : Sangat Memuaskan");
    print("======================================");
elif (float(ipk) >= 2.76 and float(ipk) < 3.01) :
    print("Predikat Lulus  : Memuaskan");
    print("======================================");
elif (float(ipk) >= 2.00 and float(ipk) < 2.76) :
    print("Predikat Lulus  : Cukup");
    print("======================================");
elif (float(ipk) < 2.00) :
    print("Predikat Lulus  : Tidak Lulus");
    print("======================================");
