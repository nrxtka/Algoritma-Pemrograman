nama = input("Silahkan Masukkan Nama Anda: ")
valid = input("Apakah Nama sudah benar? (ya/tidak): ")

if valid == "ya" or valid == "Ya" or valid == "YA":

    nim = int(input("Silahkan Masukkan NIM Anda: "))  # nim sebagai saldo

    print("\n===== DATA ANDA =====")
    print("Nama  :", nama)
    print("Saldo : Rp", nim)

    print("\n===== MENU ATM =====")
    print("1. Cek Saldo")
    print("2. Tarik Tunai")
    print("3. Setor Tunai")
    print("4. Transfer")
    print("5. Keluar")

    pilihan = int(input("Pilih Menu (1-5): "))

    match pilihan:

        case 1:
            print("\nSaldo Anda: Rp", nim)

        case 2:
            jumlah = float(input("\nMasukkan jumlah penarikan Rp: "))

            if jumlah > nim:
                print("Saldo anda tidak cukup")
            else:
                nim -= jumlah
                print("Penarikan berhasil.")
                print("Sisa Saldo: Rp", nim)

        case 3:
            jumlah = float(input("\nMasukkan jumlah setoran Rp: "))

            nim += jumlah
            print("Sisa Saldo: Rp", nim)

        case 4:
            tujuan = input("\nMasukkan nama penerima transfer: ")
            jumlah = float(input("Masukkan jumlah transfer Rp: "))

            if jumlah > nim:
                print("Saldo anda tidak cukup")
            else:
                nim -= jumlah
                print("Transfer ke", tujuan, "berhasil.")
                print("Sisa Saldo: Rp", nim)

        case 5:
            print("Anda Keluar, Terimakasih!")

        case _:
            print("Menu tidak valid!")

else:
    print("Nama salah, silahkan ulangi")
