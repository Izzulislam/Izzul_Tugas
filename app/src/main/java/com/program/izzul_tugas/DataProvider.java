package com.program.izzul_tugas;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.program.izzul_tugas.model.Minuman;
import com.program.izzul_tugas.model.Kuliner;
import com.program.izzul_tugas.model.Makanan;

public class DataProvider {
    private static List<Kuliner> kuliners = new ArrayList<>();

    private static List<Makanan> initDataMakanan(Context ctx) {
        List<Makanan> makanans = new ArrayList<>();
        makanans.add(new Makanan("Bakso", "Rp.25.000,00",
                "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.", R.drawable.makanan_bakso1));
        makanans.add(new Makanan("Gudeg", "Rp.20.000,00",
                "Gudheg) adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan.", R.drawable.makanan_gudeg2));
        makanans.add(new Makanan("Lumpia", "Rp.2.500,00",
                "Lumpia yang dikenal oleh orang Indonesia merupakan lafal Bahasa Hokkian.", R.drawable.makanan_lumpia3));
        makanans.add(new Makanan("Nasi Goreng", "Rp.25.000,00",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega.", R.drawable.makanan_nasigoreng4));
        makanans.add(new Makanan("Nasi Liwet", "Rp.15.000,00",
                "Kegiatan memasak nasi liwet ala Sunda dan makan bersama dengan alas daun pisang dalam tradisi masyarakat Sunda disebut Ngaliwet.", R.drawable.makanan_nasiliwet5));
        makanans.add(new Makanan("Tengklek", "Rp.12.000,00",
                "Tengkleng adalah makanan khas yang berasal Jawa Tengah (Solo), dengan bahan baku utama berupa tulang/ tetelan kambing yang dimasak gulai, tetapi sedikit lebih encer.", R.drawable.makanan_tengkleng6));
        return makanans;
    }

    private static List<Minuman> initDataMinuman(Context ctx) {
        List<Minuman> minumans = new ArrayList<>();
        minumans.add(new Minuman("Wedanguwuh", "Rp.10.000,00",
                "Wedang uwuh adalah salah satu minuman tradisional yang kerap digunakan dalam pengobatan tradisional.", R.drawable.minuman_wedanguwuh1));
        minumans.add(new Minuman("Bajigur", "Rp.17.000,00",
                "Bajigur adalah minuman tradisional khas masyarakat Sunda dari daerah Jawa Barat, Indonesia. Bahan utamanya adalah gula aren dan santan.", R.drawable.minuman_bajigur2));
        minumans.add(new Minuman("Bandrek", "Rp.20.000,00",
                "Bandrek adalah minuman tradisional khas Sunda yang dikonsumsi untuk meningkatkan kehangatan tubuh", R.drawable.minuman_bandrek3));
        minumans.add(new Minuman("Birpletol", "Rp.12.000,00",
                "Birpletok merupakan minuman khas Betawi yang sama sekali tidak mengandung alkhol, dikemas dalam botol dalam botol dan diracik dari berbagai rempah-rempah.", R.drawable.minuman_birpletok4));
        minumans.add(new Minuman("Sarabba", "Rp,7.000,00",
                "Sarabba adalah minuman khas Suku Bugis, Makassar, Sulawesi Selatan.", R.drawable.minuman_sarabba5));
        minumans.add(new Minuman("Teh talua", "Rp.25.000,00",
                "Teh talua adolah minuman nan tabuek dari kuniang talua jo gulo nan alah dikacau kudian diagiah aia teh.",R.drawable.minuman_tehtalua6));

        return minumans;
    }

    private static void initAllKuliners(Context ctx) {
        kuliners.addAll(initDataMakanan(ctx));
        kuliners.addAll(initDataMinuman(ctx));
    }

    public static List<Kuliner> getAllKuliner(Context ctx) {
        if (kuliners.size() == 0) {
            initAllKuliners(ctx);
        }
        return  kuliners;
    }

    public static List<Kuliner> getKulinersByTipe(Context ctx, String jenis) {
        List<Kuliner> kulinersByType = new ArrayList<>();
        if (kuliners.size() == 0) {
            initAllKuliners(ctx);
        }
        for (Kuliner h : kuliners) {
            if (h.getJenis().equals(jenis)) {
                kulinersByType.add(h);
            }
        }
        return kulinersByType;
    }

}
