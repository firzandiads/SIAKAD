umur = input("Masukkan umur anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
elif (umur > 19):
    print("Anda dewasa")
else :
    print("Umur anda tidak valid")