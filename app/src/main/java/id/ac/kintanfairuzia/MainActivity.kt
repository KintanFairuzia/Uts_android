package id.ac.kintanfairuzia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.angklung,"Alat Musik Tradisional","angklung","Angklung adalah salah satu alat tradisional Indonesia yang terbuat dari bambu. Angklung dikenal sebagai alat musik yang berasal dari tanah Sunda yakni Jawa Barat. Angklung terdiri dari dua, tiga atau empat bambu dengan susunan dua, tiga dan empat nada. Cara memainkannya dengan digoyangkan atau digetarkan."))

        data?.add(DataModel(R.drawable.kolintang,"Alat Musik Tradisional","kolintang", "Kolintang adalah salah satu alat musik tradisional masyarakat Minahasa di Sulawesi Utara. Biasanya alat musik tradisional ini digunakan untuk mengiringi upacara adat, pertunjukan tari, pengiring nyanyian, bahkan pertunjukan musik. Alat musik ini terbuat dari kayu khusus yang disusun dan cara memainkannya dengan dipukul."))

        data?.add(DataModel(R.drawable.kompang,"Alat Musik Tradisional","kompang", "Kompang merupakan alat musik tradisional dari Provinsi Lampung yang dibuat dari kayu dan kulit kambing. Kompang biasanya dimainkan pada beberapa acara seperti upacara adat, acara pernikahan, dan penyambutan pejabat yang sedang berkunjung. Cara memainkan Kompang adalah dengan cara dipukul. Biasanya ada iringan lagu atau syair bernuansa islami yang mengikuti alat musik ini."))

        data?.add(DataModel(R.drawable.panting,"Alat Musik Tradisional","panting", "tAlat musik panting adalah salah satu alat tradisi yang secara pemetaan tumbuh dan berkembang di daerah Tapin, Kalimantan Selatan. Alat musik panting terbuat dari kayu, kulit zat pewarna, dan senar. Kayu yang digunakan di antaranya kayu pulantan, kayu kambang, kayu jingah, kayu halaban, dll. Sedangkan bahan kulit diambil dari kulit hewan yang hidup di hutan seperti kulit kijang, rusa, atau kulit hewan melata seperti kulit ular puraca, ular sawa, dan biawak. Cara memainkan alat musik ini adalah dengan cara dipetik."))

        data?.add(DataModel(R.drawable.saluang,"Alat Musik Tradisional","saluang", "Saluang adalah alat musik tradisional khas suku Minangkabau di Sumatera Barat. Alat musik ini terbuat dari bambu tipis atau bambu talang. Bambu talang dipercaya bisa mengeluarkan suara yang lebih bagus dan merdu. Alat musik Saluang termasuk golongan seruling dan cara memainkannya dilakukan dengan ditiup."))

        data?.add(DataModel(R.drawable.tehyan,"Alat Musik Tradisional","tehyan", "AAlat musik tradisional Teh-hian atau Tehyan yang berasal dari Betawi. Badan alat musik Tehyan sendiri terbuat dari tempurung kelapa yang dibelah lalu dilapis kulit tipis, tiang kayu berbentuk bulat panjang, dan purilan atau alat penegang dawai. Alat musik ini merupakan gesek berdawai dua dan dimainkan dengan cara digesek menggunakan tongkat bersenar plastik (kenur)."))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("jenis", item?.jenis)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}