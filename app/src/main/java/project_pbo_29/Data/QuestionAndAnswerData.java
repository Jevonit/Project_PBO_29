package project_pbo_29.Data;

import java.util.*;

public class QuestionAndAnswerData{
    private static final Map<String, List<QuestionAnswer>> questionTree = new HashMap<>();

    static {
        questionTree.put("root", Arrays.asList( //Done = bot, reduce, reuse, energi, olahSampah
                new QuestionAnswer("Anda siapa?", "Saya adalah aplikasi Eco-Resolver yang memiliki informasi - informasi mengenai lingkungan, anda dapat menanyakan berbagai macam pertanyaan kepada saya lewat Question button yang tersedia", "bot1"),
                new QuestionAnswer("Apa itu Reduce?", "Reduce atau reduksi adalah upaya pengelolaan sampah yang dilakukan dengan mengurangi penggunaan barang yang berpotensi menambah sampah instan. Anda bisa memulai dengan mengurangi penggunaan plastik sekali pakai, memilih produk dengan kemasan minimal, dan membeli barang dalam jumlah besar untuk mengurangi kemasan.", "reduce1"),
                new QuestionAnswer("Apa itu Reuse?", "Reuse berarti menggunakan kembali sampah yang masih bisa dipakai. Hal ini bisa menjadi solusi pengelolaan sampah mandiri sehingga tidak harus selalu dibuang dan berakhir di TPA.", "reuse1"),
                new QuestionAnswer("Apa itu Recycle?", "Recycle merupakan kegiatan mendaur ulang sampah-sampah atau bahan tidak terpakai menjadi bahan lain dengan melalui proses pengolahan.", "recycle1"),
                new QuestionAnswer("Apa itu Replace?", "Replace adalah upaya pengelolaan sampah dengan cara mengganti barang instan yang biasa dipakai dengan barang lain yang lebih ramah lingkungan.", "replace1"),
                new QuestionAnswer("Apa yang bisa kita lakukan untuk mengurangi sampah?", "Baik, berikut ini adalah beberapa cara untuk mengurangi sampah" +
                                                                                                "\n" +
                                                                                                "1. Membawa Kantong Belanja Sendiri\n" +
                                                                                                "Meskipun kantong plastik memang praktis, tapi hal inilah yang membuat sampah pada bumi terus bertumpuk tak terkendali. Membawa kantong belanja sendiri saat belanja atau bepergian adalah cara yang paling mudah untuk berkontribusi mengurangi sampah pribadi.\n" +
                                                                                                "\n" +
                                                                                                "2. Membawa Botol Minum atau Tumbler\n" +
                                                                                                "Apa yang dibutuhkan ketika haus? Tentu, air minum. Ketika haus jawabannya tidak harus membeli air minum kemasan. Lebih baik menyiapkan air minum dari rumah dengan menggunakan botol minum atau tumbler. Selain bentuk dari peduli terhadap lingkungan, membawa botol minum sendiri juga bisa menghemat uang.\n" +
                                                                                                "\n" +
                                                                                                "3. Tidak Menggunakan Sedotan Plastik\n" +
                                                                                                "Sedotan plastik memang terlihat remeh. Tapi bayangkan jika ribuan orang yang berfikir seremeh itu?. Tentulah sangat berdampak bagi lingkungan. Sekarang, mulailah mengganti sedotan plastik dengan sedotan bambu atau kertas yang ramah lingkungan.\n" +
                                                                                                "\n" +
                                                                                                "4. Hindari Membeli Makanan dan Minuman Kemasan Plastik\n" +
                                                                                                "Usahakan, jangan membeli produk dalam kemasan sachet, tapi belilah produk yang dikemas dalam ukuran besar untuk mengurangi sampah. Jika memungkinkan, pilih produk yang dikemas dalam botol kaca atau daun.\n" +
                                                                                                "\n" +
                                                                                                "5. Daur Ulang Sampah Plastik\n" +
                                                                                                "Tidak semua plastik bisa didaur ulang. Namun, beberapa barang, seperti botol minuman dan pot tanaman dapat dilakukan proses recycle. Kreasikan sampah plastik menjadi hiasan atau barang lain yang dibutuhkan di rumah.", "root"),

                new QuestionAnswer("Bagaimana cara menghemat energi?", "Ada banyak cara menghemat energi, mulai dari menggunakan lampu LED hingga mematikan perangkat elektronik ketika tidak digunakan, anda ingin diberikan contoh dalam konteks apa?", "energi1"),

                new QuestionAnswer("Saya ingin mengolah sampah, namun saya tidak tahu sampah ini diolah menjadi apa", "Tentu, bisa beritahu saya jenis sampahnya? apakah limbah organik atau anorganik ", "pertanyaanUtama_1")
        ));



        questionTree.put("bot1", Arrays.asList(
                new QuestionAnswer("Saat ini anda memiliki berapa Data?", "Saat ini saya memiliki lebih dari 100 kemungkinan chat yang berbeda, anda dapat mencobanya , Semoga anda dapat mendapatkan informasi yang berguna!", "root"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));


        
        questionTree.put("pertanyaanUtama_1", Arrays.asList(
                new QuestionAnswer("Sampah Jenis organik", "Apakah Anda tertarik dengan kompos atau biogas?", "pertanyaanUtama_21"),
                new QuestionAnswer("Sampah Jenis anorganik", "Bisa beritahu terbuat dari apa sampah tersebut?", "pertanyaanUtama_22"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Jawaban untuk sampah organik
        questionTree.put("pertanyaanUtama_21", Arrays.asList(
                new QuestionAnswer("Kompos", "Apakah Anda ingin membuat kompos di rumah atau dalam skala besar untuk dijual?", "pertanyaanUtama_21_1"),
                new QuestionAnswer("Biogas", "Apakah Anda ingin menggunakan biogas untuk keperluan rumah tangga atau skala komersial?", "pertanyaanUtama_21_2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "pertanyaanUtama_1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("pertanyaanUtama_21_1", Arrays.asList(
                new QuestionAnswer("Di rumah", "Anda bisa membuat kompos menggunakan wadah kompos atau komposter. Caranya adalah dengan mengumpulkan sampah dapur seperti sisa sayuran, buah-buahan, dan daun-daunan. Masukkan bahan-bahan ini ke dalam komposter, tambahkan tanah atau serbuk gergaji, dan aduk secara berkala. Pastikan untuk menjaga kelembapan dan aerasi yang baik. Dalam beberapa minggu, Anda akan mendapatkan kompos yang bisa digunakan sebagai pupuk organik untuk tanaman di rumah Anda.", "root"),
                new QuestionAnswer("Skala besar", "Untuk skala besar, Anda memerlukan lahan yang cukup luas dan peralatan seperti mesin pencacah, alat pengaduk, dan sistem aerasi. Prosesnya melibatkan pengumpulan sampah organik dalam jumlah besar, mencacahnya menjadi potongan kecil, dan menumpuknya dalam kompos. Anda perlu memantau suhu, kelembapan, dan aerasi secara teratur. Setelah beberapa bulan, Anda akan memiliki kompos dalam jumlah besar yang dapat dijual sebagai pupuk organik.", "root"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "pertanyaanUtama_21"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("pertanyaanUtama_21_2", Arrays.asList(
                new QuestionAnswer("Rumah tangga", "Anda bisa membuat instalasi biogas kecil di rumah. Caranya adalah dengan menggunakan digester, yaitu wadah tertutup yang akan menampung sampah organik seperti sisa makanan dan kotoran hewan. Dalam digester, sampah organik akan terurai oleh bakteri anaerobik menghasilkan gas metana yang bisa digunakan untuk memasak atau menghasilkan listrik. Anda bisa mencari panduan lebih lanjut tentang cara membuat digester sederhana.", "root"),
                new QuestionAnswer("Skala komersial", "Untuk skala komersial, Anda memerlukan instalasi biogas yang lebih besar dan investasi awal yang cukup besar. Prosesnya melibatkan pengumpulan sampah organik dalam jumlah besar, pengolahan dalam digester besar, dan pemanenan gas metana yang dihasilkan. Gas metana ini bisa diubah menjadi energi listrik atau bahan bakar. Anda mungkin perlu bekerja sama dengan ahli biogas dan mencari pendanaan untuk proyek ini.", "root"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "pertanyaanUtama_21"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Jawaban untuk sampah anorganik
        questionTree.put("pertanyaanUtama_22", Arrays.asList(
                new QuestionAnswer("Plastik", "Apakah Anda tertarik dengan daur ulang plastik atau membuat produk kerajinan dari plastik?", "pertanyaanUtama_22_1"),
                new QuestionAnswer("Kaca", "Kaca bisa didaur ulang menjadi kaca baru atau digunakan untuk membuat kerajinan tangan. Untuk daur ulang, Anda bisa mengumpulkan dan mengirimkan sampah kaca ke pusat daur ulang. Untuk kerajinan, Anda bisa membuat mozaik, vas, atau dekorasi rumah dari pecahan kaca. Pastikan untuk bekerja dengan hati-hati agar tidak terluka.", "pertanyaanUtama_22"),
                new QuestionAnswer("Logam", "Logam seperti aluminium dan besi dapat didaur ulang atau digunakan kembali. Anda bisa mengumpulkan sampah logam dan menjualnya ke pengepul logam. Proses daur ulang melibatkan peleburan logam untuk membuat produk baru. Selain itu, Anda bisa membuat kerajinan tangan dari logam bekas seperti patung atau dekorasi taman.", "pertanyaanUtama_22"),
                new QuestionAnswer("Kertas", "Kertas dapat didaur ulang menjadi kertas baru atau digunakan untuk membuat berbagai kerajinan tangan. Untuk daur ulang, kumpulkan kertas bekas dan kirimkan ke pusat daur ulang. Untuk kerajinan, Anda bisa membuat kertas daur ulang di rumah dengan mencacah kertas, merendamnya dalam air, dan menekannya menjadi lembaran baru. Anda juga bisa membuat seni origami, kartu ucapan, atau dekorasi dari kertas bekas.", "pertanyaanUtama_22"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "pertanyaanUtama_1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("pertanyaanUtama_22_1", Arrays.asList(
                new QuestionAnswer("Daur ulang", "Anda bisa mengumpulkan sampah plastik dan mengirimkannya ke pusat daur ulang plastik. Proses daur ulang melibatkan pemisahan, pencucian, dan pencacahan plastik menjadi pelet yang bisa digunakan untuk membuat produk plastik baru. Anda juga bisa mencari informasi tentang cara mendaur ulang plastik di rumah menggunakan peralatan sederhana.", "pertanyaanUtama_22_1"),
                new QuestionAnswer("Kerajinan", "Anda bisa membuat berbagai produk kerajinan dari sampah plastik, seperti tas, dompet, atau perhiasan. Caranya adalah dengan mengumpulkan sampah plastik bersih, memotongnya menjadi bentuk yang diinginkan, dan menggabungkannya menggunakan lem atau teknik anyaman. Banyak ide kreatif yang bisa ditemukan di internet untuk inspirasi.", "pertanyaanUtama_22_1"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "pertanyaanUtama_22"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));



        // Reduce
        questionTree.put("reduce1", Arrays.asList(
                new QuestionAnswer("Mengapa penting untuk melakukan reduce?", 
                        "1. Mengurangi dampak lingkungan: Mengurangi penggunaan barang sekali pakai dapat mengurangi jumlah sampah yang masuk ke tempat pembuangan akhir.\n2. Menghemat sumber daya: Dengan mengurangi konsumsi, kita menghemat sumber daya alam yang digunakan untuk membuat produk baru.\n3. Mengurangi polusi: Mengurangi produksi barang juga berarti mengurangi polusi yang dihasilkan dari proses produksi tersebut.", 
                        "reduce2"),
                new QuestionAnswer("Apa contoh-contoh praktik reduce dalam kehidupan sehari-hari?", 
                        "Beberapa contoh praktik reduce dalam kehidupan sehari-hari meliputi menggunakan botol minum dan tas belanja yang dapat digunakan berulang kali, membeli produk dengan kemasan yang dapat didaur ulang atau tanpa kemasan sama sekali, dan meminimalisir penggunaan kertas dengan cara beralih ke dokumen digital.", 
                        "reduce3"),
                new QuestionAnswer("Bagaimana cara memulai reduce di rumah?", 
                        "Untuk memulai reduce di rumah, Anda bisa melakukan audit sampah untuk mengidentifikasi barang-barang yang sering menjadi sampah, mulai dari yang kecil seperti mengganti kantong plastik dengan kantong kain, dan mengedukasi seluruh anggota keluarga agar terlibat dalam upaya reduce ini.", 
                        "reduce4"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce2", Arrays.asList(
                new QuestionAnswer("Apa dampak positif reduce terhadap lingkungan?", 
                        "1. Mengurangi jumlah sampah: Dengan mengurangi konsumsi, jumlah sampah yang dihasilkan pun akan berkurang.\n2. Menurunkan emisi karbon: Proses produksi barang baru menghasilkan emisi karbon, dengan mengurangi konsumsi, kita dapat menurunkan emisi ini.\n3. Mengurangi penebangan hutan: Mengurangi penggunaan produk kertas dapat mengurangi kebutuhan akan penebangan hutan.", 
                        "reduce5"),
                new QuestionAnswer("Bagaimana peran pemerintah dalam mendukung reduce?", 
                        "Pemerintah dapat mendukung reduce melalui berbagai cara seperti mengeluarkan regulasi yang membatasi penggunaan barang-barang sekali pakai, melakukan kampanye edukasi kepada masyarakat tentang pentingnya reduce, dan menyediakan fasilitas pendukung seperti tempat daur ulang dan insentif bagi perusahaan yang mengurangi penggunaan kemasan.", 
                        "reduce6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce3", Arrays.asList(
                new QuestionAnswer("Apa hubungan antara reduce dan perubahan iklim?", 
                        "Ada beberapa hubungan antara reduce dan perubahan iklim, di antaranya:\n1. Mengurangi emisi: Mengurangi konsumsi berarti mengurangi produksi barang baru yang berkontribusi pada emisi gas rumah kaca.\n2. Menghemat energi: Produksi barang baru memerlukan energi yang besar, dengan reduce kita menghemat energi tersebut.\n3. Mengurangi jejak karbon: Mengurangi jumlah sampah yang dihasilkan juga mengurangi jejak karbon individu atau rumah tangga.", 
                        "reduce7"),
                new QuestionAnswer("Bagaimana cara memulai reduce di tempat kerja?", 
                        "Untuk memulai reduce di tempat kerja, Anda bisa melakukan evaluasi kebutuhan untuk meninjau barang-barang yang diperlukan dan mencari alternatif yang lebih ramah lingkungan, mengedukasi karyawan tentang program reduce melalui pelatihan dan informasi, serta mengimplementasikan kebijakan kantor yang mendukung upaya reduce, seperti mengurangi penggunaan kertas dan plastik sekali pakai.", 
                        "reduce8"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce4", Arrays.asList(
                new QuestionAnswer("Apa manfaat ekonomis dari reduce?", 
                        "Manfaat ekonomis dari reduce meliputi menghemat uang dengan membeli barang dalam jumlah besar atau barang yang tahan lama, mengurangi biaya pembuangan sampah dengan mengurangi jumlah sampah yang dihasilkan, serta meningkatkan efisiensi penggunaan sumber daya dengan mengurangi konsumsi dan memaksimalkan penggunaan barang yang ada.", 
                        "reduce9"),
                new QuestionAnswer("Bagaimana cara melibatkan komunitas dalam reduce?", 
                        "Untuk melibatkan komunitas dalam reduce, Anda bisa mengadakan kampanye lokal untuk mengedukasi masyarakat tentang pentingnya reduce, bekerjasama dengan komunitas untuk mengadakan program daur ulang dan mengurangi sampah, serta bekerja sama dengan organisasi lokal yang fokus pada isu lingkungan untuk meningkatkan dampak reduce.", 
                        "reduce10"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce5", Arrays.asList(
                new QuestionAnswer("Apa peran individu dalam mendukung reduce?", 
                        "Peran individu dalam mendukung reduce sangat penting. Setiap orang dapat berkontribusi dengan:\n1. Mengurangi penggunaan barang sekali pakai.\n2. Memilih produk dengan kemasan minimal atau yang dapat didaur ulang.\n3. Mendidik diri sendiri dan orang lain tentang pentingnya reduce.\n4. Mendukung kebijakan dan program reduce di lingkungan sekitar.", 
                        "reduce11"),
                new QuestionAnswer("Apa tantangan yang dihadapi dalam implementasi reduce?", 
                        "Beberapa tantangan yang dihadapi dalam implementasi reduce meliputi kurangnya kesadaran masyarakat tentang pentingnya reduce, kurangnya fasilitas pendukung seperti tempat daur ulang, dan kebiasaan konsumsi yang sulit diubah. Oleh karena itu, edukasi dan sosialisasi yang berkelanjutan sangat diperlukan.", 
                        "reduce5"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce2"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce6", Arrays.asList(
                new QuestionAnswer("Bagaimana cara mempromosikan reduce di kalangan anak muda?", 
                        "Mempromosikan reduce di kalangan anak muda bisa dilakukan melalui:\n1. Kampanye media sosial: Menggunakan platform media sosial untuk menyebarkan informasi tentang pentingnya reduce.\n2. Edukasi di sekolah: Memasukkan materi tentang reduce dalam kurikulum sekolah.\n3. Kegiatan komunitas: Mengadakan kegiatan atau event yang mendukung upaya reduce, seperti lomba kreatif dengan bahan daur ulang.", 
                        "reduce6"),
                new QuestionAnswer("Apa manfaat reduce bagi kesehatan?", 
                        "Manfaat reduce bagi kesehatan meliputi mengurangi paparan bahan kimia berbahaya yang terdapat dalam plastik dan produk sekali pakai, mengurangi polusi udara yang dihasilkan dari pembakaran sampah, dan mendorong konsumsi produk yang lebih alami dan sehat.", 
                        "reduce6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce2"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce7", Arrays.asList(
                new QuestionAnswer("Apa langkah sederhana untuk memulai reduce di sekolah?", 
                        "Langkah sederhana untuk memulai reduce di sekolah meliputi:\n1. Mengurangi penggunaan kertas dengan beralih ke materi digital.\n2. Mendorong siswa untuk membawa botol minum dan wadah makanan sendiri.\n3. Mengadakan program daur ulang di sekolah untuk mengurangi sampah.\n4. Mengedukasi siswa tentang pentingnya reduce dan bagaimana menerapkannya.", 
                        "reduce7"),
                new QuestionAnswer("Apa keuntungan reduce bagi ekonomi lokal?", 
                        "Keuntungan reduce bagi ekonomi lokal antara lain mengurangi biaya pembuangan sampah, menciptakan peluang usaha baru dalam bidang daur ulang, dan mendukung usaha lokal yang menerapkan prinsip reduce dalam produknya.", 
                        "reduce7"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce3"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce8", Arrays.asList(
                new QuestionAnswer("Bagaimana cara mengukur keberhasilan program reduce?", 
                        "Keberhasilan program reduce dapat diukur dengan:\n1. Menghitung pengurangan jumlah sampah yang dihasilkan.\n2. Memonitor pengurangan penggunaan barang sekali pakai.\n3. Melakukan survei kepuasan dan partisipasi dari karyawan atau komunitas.\n4. Melihat penghematan biaya yang dicapai dari implementasi program reduce.", 
                        "reduce8"),
                new QuestionAnswer("Apa peran teknologi dalam mendukung reduce?", 
                        "Teknologi dapat mendukung reduce dengan menyediakan solusi inovatif seperti aplikasi untuk memonitor dan mengelola sampah, platform online untuk berbagi dan menjual barang bekas, serta teknologi pengemasan ramah lingkungan yang dapat mengurangi penggunaan plastik.", 
                        "reduce8"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce3"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce9", Arrays.asList(
                new QuestionAnswer("Bagaimana mengedukasi anak-anak tentang pentingnya reduce?", 
                        "Mengedukasi anak-anak tentang pentingnya reduce dapat dilakukan dengan:\n1. Memberikan contoh nyata di rumah, seperti menggunakan kembali barang-barang dan mengurangi penggunaan plastik.\n2. Membuat kegiatan kreatif seperti kerajinan dari barang bekas.\n3. Membaca buku atau menonton film edukatif tentang lingkungan.\n4. Melibatkan mereka dalam program reduce di sekolah atau komunitas.", 
                        "reduce9"),
                new QuestionAnswer("Apa manfaat jangka panjang dari reduce?", 
                        "Manfaat jangka panjang dari reduce meliputi:\n1. Kelestarian lingkungan: Mengurangi beban sampah dan polusi yang merusak ekosistem.\n2. Keberlanjutan sumber daya: Memastikan sumber daya alam tetap tersedia untuk generasi mendatang.\n3. Ekonomi yang berkelanjutan: Membangun ekonomi yang lebih efisien dan ramah lingkungan.", 
                        "reduce9"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce4"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce10", Arrays.asList(
                new QuestionAnswer("Bagaimana cara mengurangi penggunaan plastik dalam kehidupan sehari-hari?", 
                        "Untuk mengurangi penggunaan plastik dalam kehidupan sehari-hari, Anda bisa:\n1. Menggunakan tas belanja kain daripada plastik.\n2. Membawa botol minum sendiri.\n3. Memilih produk tanpa kemasan plastik.\n4. Menghindari barang sekali pakai seperti sedotan dan sendok plastik.", 
                        "reduce10"),
                new QuestionAnswer("Apa keuntungan reduce bagi bisnis?", 
                        "Keuntungan reduce bagi bisnis meliputi mengurangi biaya produksi dan operasional dengan penggunaan bahan yang lebih efisien, meningkatkan citra perusahaan sebagai bisnis yang peduli lingkungan, dan mematuhi regulasi yang mendukung praktek ramah lingkungan.", 
                        "reduce10"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce4"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("reduce11", Arrays.asList(
                new QuestionAnswer("Apa peran individu dalam mendukung reduce?", 
                        "Peran individu dalam mendukung reduce sangat penting. Setiap orang dapat berkontribusi dengan:\n1. Mengurangi penggunaan barang sekali pakai.\n2. Memilih produk dengan kemasan minimal atau yang dapat didaur ulang.\n3. Mendidik diri sendiri dan orang lain tentang pentingnya reduce.\n4. Mendukung kebijakan dan program reduce di lingkungan sekitar.", 
                        "reduce11"),
                new QuestionAnswer("Apa tantangan yang dihadapi dalam implementasi reduce?", 
                        "Beberapa tantangan yang dihadapi dalam implementasi reduce meliputi kurangnya kesadaran masyarakat tentang pentingnya reduce, kurangnya fasilitas pendukung seperti tempat daur ulang, dan kebiasaan konsumsi yang sulit diubah. Oleh karena itu, edukasi dan sosialisasi yang berkelanjutan sangat diperlukan.", 
                        "reduce11"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reduce2"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));



        //Reuse
        questionTree.put("reuse1", Arrays.asList(
                new QuestionAnswer("Apa manfaat dari reuse?", 
                "Manfaat dari reuse meliputi:\n1. Mengurangi jumlah sampah yang berakhir di TPA.\n2. Menghemat sumber daya alam dengan menggunakan barang yang sudah ada.\n3. Menghemat uang karena tidak perlu membeli barang baru.", 
                "reuse2"),
                new QuestionAnswer("Apa contoh-contoh praktik reuse?", 
                "Contoh praktik reuse meliputi:\n1. Menggunakan kembali wadah atau botol kaca untuk penyimpanan.\n2. Mendonasikan pakaian atau barang yang tidak terpakai ke orang lain atau lembaga sosial.\n3. Memanfaatkan barang bekas untuk proyek kerajinan atau DIY.", 
                "reuse3"),
                new QuestionAnswer("Bagaimana cara memulai reuse di rumah?", 
                "Untuk memulai reuse di rumah, Anda bisa:\n1. Melakukan inventarisasi barang yang bisa digunakan kembali.\n2. Membuat kebijakan keluarga untuk menggunakan barang hingga benar-benar tidak bisa dipakai lagi.\n3. Mencari inspirasi dari internet tentang proyek reuse kreatif.", 
                "reuse4"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Cabang reuse2
        questionTree.put("reuse2", Arrays.asList(
                new QuestionAnswer("Bagaimana peran komunitas dalam mendukung reuse?", 
                "Peran komunitas dalam mendukung reuse sangat penting. Komunitas dapat mengadakan acara tukar barang, mendirikan bank barang bekas, dan memberikan edukasi tentang pentingnya reuse kepada anggotanya.", 
                "reuse5"),
                new QuestionAnswer("Apa saja barang yang paling mudah untuk direuse?", 
                "Beberapa barang yang paling mudah untuk direuse meliputi:\n1. Pakaian dan tekstil.\n2. Perabotan rumah tangga.\n3. Wadah dan botol kaca atau plastik.", 
                "reuse6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reuse1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Cabang reuse3, bercabang ke reuse5 juga
        questionTree.put("reuse3", Arrays.asList(
                new QuestionAnswer("Bagaimana cara kreatif untuk reuse barang di rumah?", 
                "Cara kreatif untuk reuse barang di rumah termasuk membuat kerajinan tangan dari barang bekas, mengubah fungsi barang seperti menggunakan kaleng bekas sebagai pot tanaman, dan mendekorasi ulang perabotan lama untuk memberikan tampilan baru.", 
                "reuse5"),
                new QuestionAnswer("Apa perbedaan antara reuse dan recycle?", 
                "Reuse berarti menggunakan kembali barang tanpa proses pengolahan ulang, sementara recycle melibatkan proses pengolahan barang bekas menjadi bahan baku baru untuk membuat produk baru. Reuse lebih menghemat energi dan sumber daya dibandingkan recycle.", 
                "reuse6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reuse1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Cabang reuse4, bercabang ke reuse5 dan reuse6
        questionTree.put("reuse4", Arrays.asList(
                new QuestionAnswer("Bagaimana mengajak anggota keluarga lain untuk mendukung reuse?", 
                "Untuk mengajak anggota keluarga lain mendukung reuse, Anda bisa memulai dengan memberi contoh, mengajak mereka ikut dalam proyek reuse yang menyenangkan, dan menjelaskan manfaat ekonomis serta lingkungan dari reuse.", 
                "reuse5"),
                new QuestionAnswer("Apa tantangan terbesar dalam menerapkan reuse?", 
                "Tantangan terbesar dalam menerapkan reuse meliputi:\n1. Kurangnya kesadaran dan informasi tentang manfaat reuse.\n2. Kebiasaan konsumsi masyarakat yang cenderung memilih barang baru.\n3. Keterbatasan dalam kreativitas menggunakan kembali barang.", 
                "reuse6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reuse1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Cabang reuse5
        questionTree.put("reuse5", Arrays.asList(
                new QuestionAnswer("Bagaimana peran komunitas dalam mendukung reuse?", 
                "Peran komunitas dalam mendukung reuse sangat penting. Komunitas dapat mengadakan acara tukar barang, mendirikan bank barang bekas, dan memberikan edukasi tentang pentingnya reuse kepada anggotanya.", 
                "reuse5"),
                new QuestionAnswer("Apa saja barang yang paling mudah untuk direuse?", 
                "Beberapa barang yang paling mudah untuk direuse meliputi:\n1. Pakaian dan tekstil.\n2. Perabotan rumah tangga.\n3. Wadah dan botol kaca atau plastik.", 
                "reuse5"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reuse1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        // Cabang reuse6
        questionTree.put("reuse6", Arrays.asList(
                new QuestionAnswer("Apa perbedaan antara reuse dan recycle?", 
                "Reuse berarti menggunakan kembali barang tanpa proses pengolahan ulang, sementara recycle melibatkan proses pengolahan barang bekas menjadi bahan baku baru untuk membuat produk baru. Reuse lebih menghemat energi dan sumber daya dibandingkan recycle.", 
                "reuse6"),
                new QuestionAnswer("Bagaimana cara kreatif untuk reuse barang di rumah?", 
                "Cara kreatif untuk reuse barang di rumah termasuk membuat kerajinan tangan dari barang bekas, mengubah fungsi barang seperti menggunakan kaleng bekas sebagai pot tanaman, dan mendekorasi ulang perabotan lama untuk memberikan tampilan baru.", 
                "reuse6"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya.", "reuse1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));



        // Add branches for Recycle
        questionTree.put("recycle1", Arrays.asList(
                new QuestionAnswer("Bagaimana cara melakukan Recycle?", "Berikut adalah beberapa cara melakukan Recycle: \n1. Memisahkan sampah berdasarkan jenisnya\n2. Mengumpulkan sampah yang bisa didaur ulang\n3. Membawa sampah ke tempat daur ulang", "recycle2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("recycle2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Recycle?", "Recycle membantu mengurangi polusi, menghemat energi, dan mengurangi kebutuhan akan bahan baku baru.", "recycle3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "recycle1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("recycle3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Recycle?", "Beberapa contoh barang yang bisa di-Recycle termasuk kertas, plastik, kaca, dan logam.", "recycle4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "recycle2"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));



        // Add branches for Replace
        questionTree.put("replace1", Arrays.asList(
                new QuestionAnswer("Bagaimana cara melakukan Replace?", "Berikut adalah beberapa cara melakukan Replace: \n1. Menggunakan produk yang lebih ramah lingkungan\n2. Mengganti produk sekali pakai dengan produk yang dapat digunakan kembali\n3. Memilih produk dengan kemasan yang dapat didaur ulang", "replace2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("replace2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Replace?", "Replace membantu mengurangi limbah dan dampak negatif terhadap lingkungan dengan memilih alternatif yang lebih ramah lingkungan.", "replace3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "replace1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("replace3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Replace?", "Beberapa contoh barang yang bisa di-Replace termasuk sedotan plastik dengan sedotan bambu, kantong plastik dengan kantong kain, dan botol plastik dengan botol stainless steel.", "replace4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "replace2"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));



        //Bagian Energi
        questionTree.put("energi1", Arrays.asList(
                new QuestionAnswer("Di Rumah", "berikut ini beberapa cara menghemat energi dirumah" + 
                                                         "\n1. Gunakan Lampu LED \n   Lampu LED lebih efisien dalam menggunakan energi dibandingkan dengan lampu pijar dan CFL (Compact Fluorescent Lamp)." +
                                                         "\n2. Matikan perangkat eletronik \n   Matikan perangkat seperti komputer, TV, dan peralatan dapur ketika tidak digunakan."+
                                                         "\n3. Gunakan peralatan yang hemat energi \n   Pilih peralatan rumah tangga dengan label energi yang menunjukkan efisiensi penggunaan energi.", "rumah"),
                new QuestionAnswer("Di Kehidupan sehari-hari", "berikut ini beberapa cara menghemat energi diKehidupan sehari-hari"+
                                                         "\n1. biasakan menggunakan Transportasi Umum \n   Menggunakan transportasi umum seperti bus,atau kereta dapat mengurangi konsumsi bahan bakar."+
                                                         "\n2. Gunakan sepeda jika jarak yang ditempuh dekat \n   Untuk jarak yang lebih pendek, bersepeda atau berjalan kaki adalah alternatif yang sehat dan bebas polusi.", "energi1"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "energi"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
        questionTree.put("rumah", Arrays.asList(
                new QuestionAnswer("Mengapa Memakai LED?", "Karena konsumsi energi yang lebih rendah dan umur pakainya yang lama", "rumah"),
                new QuestionAnswer("Bagaimana cara saya dapat mematikan perangkat eletronik saya dengan mudah?", "Gunakan power strip dengan tombol on/off untuk memudahkan mematikan beberapa perangkat sekaligus.", "rumah"),
                new QuestionAnswer("Bagaimana saya tahu peralatan tersebut hemat energi?", "Biasanya peralatan seperti mesin cuci, kulkas, AC, dan oven dengan hemat energi memiliki sertifikasi ENERGY STAR", "rumah"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "energi1"),
                new QuestionAnswer("Reset QuestionBox ke awal", "Baik", "root")
        ));
    }

    public static List<QuestionAnswer> getQuestions(String key) {
        return questionTree.getOrDefault(key, new ArrayList<>());
    }
}