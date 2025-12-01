<?php

echo "Silahkan Masukkan Nama Anda: ";
$nama = trim(fgets(STDIN));

echo "Apakah Nama sudah benar? (ya/tidak): ";
$valid = trim(fgets(STDIN));

if ($valid == "ya" || $valid == "Ya" || $valid == "YA") {

    echo "Silahkan Masukkan NIM Anda: ";
    $nim = trim(fgets(STDIN));   // NIM sebagai saldo

    echo "\n===== DATA ANDA =====\n";
    echo "Nama  : $nama\n";
    echo "Saldo : Rp $nim\n";

    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih Menu (1-5): ";
    $pilihan = trim(fgets(STDIN));

    switch ($pilihan) {

        case 1:
            echo "\nSaldo Anda: Rp $nim\n";
            break;

        case 2:
            echo "\nMasukkan jumlah penarikan Rp: ";
            $jumlah = trim(fgets(STDIN));

            if ($jumlah > $nim) {
                echo "Saldo anda tidak cukup\n";
            } else {
                $nim -= $jumlah;
                echo "Penarikan berhasil.\n";
                echo "Sisa Saldo: Rp.$nim\n";
            }
            break;

        case 3:
            echo "\nMasukkan jumlah setoran Rp: ";
            $jumlah = trim(fgets(STDIN));

            $nim += $jumlah;
            echo "Sisa Saldo: Rp.$nim\n";
            break;

        case 4:
            echo "\nMasukkan nama penerima transfer: ";
            $tujuan = trim(fgets(STDIN));

            echo "Masukkan jumlah transfer: Rp.";
            $jumlah = trim(fgets(STDIN));

            if ($jumlah > $nim) {
                echo "Saldo anda tidak cukup\n";
            } else {
                $nim -= $jumlah;
                echo "Transfer ke $tujuan berhasil.\n";
                echo "Sisa Saldo: Rp.$nim\n";
            }
            break;

        case 5:
            echo "Anda Keluar, Terimakasih!\n";
            break;

        default:
            echo "Menu tidak valid!\n";
    }

} else {
    echo "Nama salah, silahkan ulangi\n";
    exit;
}

?>
