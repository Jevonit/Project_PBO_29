package project_pbo_29.Data;

import java.util.*;

public class QuestionAndAnswerData {
    private static final Map<String, List<QuestionAnswer>> questionTree = new HashMap<>();

    static {
        questionTree.put("root", Arrays.asList(
                new QuestionAnswer("Anda siapa?", "Saya adalah aplikasi Eco-Resolver yang memiliki informasi - informasi mengenai lingkungan, anda dapat menanyakan berbagai macam pertanyaan kepada saya lewat Question button yang tersedia", "bot1"),
                new QuestionAnswer("Apa itu Reduce?", "Reduce adalah .. ", "reduce1"),
                new QuestionAnswer("Apa itu Reuse?", "Reuse adalah ...", "reuse1"),
                new QuestionAnswer("Apa itu Recycle?", "Recycle adalah ...", "recycle1"),
                new QuestionAnswer("Apa itu Replace?", "Replace adalah ...", "replace1"),
                new QuestionAnswer("Apa yang bisa kita lakukan untuk mengurangi sampah?", "Baik, berikut ini adalah beberapa cara untuk mengurangi sampah\r\n" +
                        "\r\n" +
                        "1. Membawa Kantong Belanja Sendiri\r\n" +
                        "Meskipun kantong plastik memang praktis, tapi hal inilah yang membuat sampah pada bumi terus bertumpuk tak terkendali. Membawa kantong belanja sendiri saat belanja atau bepergian adalah cara yang paling mudah untuk berkontribusi mengurangi sampah pribadi.\r\n" +
                        "\r\n" +
                        "2. Membawa Botol Minum atau Tumbler\r\n" +
                        "Apa yang dibutuhkan ketika haus? Tentu, air minum. Ketika haus jawabannya tidak harus membeli air minum kemasan. Lebih baik menyiapkan air minum dari rumah dengan menggunakan botol minum atau tumbler. Selain bentuk dari peduli terhadap lingkungan, membawa botol minum sendiri juga bisa menghemat uang.\r\n" +
                        "\r\n" +
                        "3. Tidak Menggunakan Sedotan Plastik\r\n" +
                        "Sedotan plastik memang terlihat remeh. Tapi bayangkan jika ribuan orang yang berfikir seremeh itu?. Tentulah sangat berdampak bagi lingkungan. Sekarang, mulailah mengganti sedotan plastik dengan sedotan bambu atau kertas yang ramah lingkungan.\r\n" +
                        "\r\n" +
                        "4. Hindari Membeli Makanan dan Minuman Kemasan Plastik\r\n" +
                        "Usahakan, jangan membeli produk dalam kemasan sachet, tapi belilah produk yang dikemas dalam ukuran besar untuk mengurangi sampah. Jika memungkinkan, pilih produk yang dikemas dalam botol kaca atau daun.\r\n" +
                        "\r\n" +
                        "5. Daur Ulang Sampah Plastik\r\n" +
                        "Tidak semua plastik bisa didaur ulang. Namun, beberapa barang, seperti botol minuman dan pot tanaman dapat dilakukan proses recycle. Kreasikan sampah plastik menjadi hiasan atau barang lain yang dibutuhkan di rumah.", "kain"),
                new QuestionAnswer("Saya ingin mengolah sampah, namun saya tidak tahu sampah ini diolah menjadi apa", "Tentu, bisa beritahu saya jenis sampahnya? apakah limbah organik atau anorganik ", "pertanyaanUtama_1"),
                new QuestionAnswer("Bagaimana cara menghemat energi?", "Ada banyak cara menghemat energi, mulai dari menggunakan lampu LED hingga mematikan perangkat elektronik ketika tidak digunakan.", "energi1"),
                new QuestionAnswer("Apa dampak dari pemanasan global?", "Pemanasan global dapat menyebabkan kenaikan permukaan laut, perubahan iklim ekstrem, dan kerusakan ekosistem.", "pemanasan1"),
                new QuestionAnswer("Apa manfaat menanam pohon?", "Menanam pohon membantu menyerap karbon dioksida, menghasilkan oksigen, dan menyediakan habitat bagi satwa liar.", "menanam1"),
                new QuestionAnswer("Bagaimana cara mengurangi penggunaan plastik?", "Beberapa cara untuk mengurangi penggunaan plastik termasuk membawa tas belanja kain, menggunakan botol air yang dapat diisi ulang, dan menghindari produk sekali pakai.", "plastik1"),
                new QuestionAnswer("Apa itu kompos?", "Kompos adalah proses alami daur ulang bahan organik seperti daun dan sisa makanan menjadi pupuk alami.", "kompos1"),
                new QuestionAnswer("Bagaimana cara mendaur ulang kertas?", "Kertas dapat didaur ulang dengan cara mengumpulkan kertas bekas, membersihkannya, dan mengolahnya menjadi kertas baru.", "kertas1")
        ));

        questionTree.put("bot1", Arrays.asList(
                new QuestionAnswer("Saat ini anda memiliki berapa Data?", "Saat ini saya memiliki lebih dari 100 kemungkinan chat yang berbeda, anda dapat mencobanya , Semoga anda dapat mendapatkan informasi yang berguna!", "root"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("pertanyaanUtama_1", Arrays.asList(
                new QuestionAnswer("Sampah Jenis organik", "Bisa beritahu terbuat dari apa sampah tersebut?", "pertanyaanUtama_21"),
                new QuestionAnswer("Sampah Jenis anorganik", "Bisa beritahu terbuat dari apa sampah tersebut?", "pertanyaanUtama_22"),
                new QuestionAnswer("Apa itu limbah organik?", "Limbah organik didefinisikan sebagai sisa-sisa buangan atau sampah yang dihasilkan makhluk hidup dan akan secara otomatis mengalami pembusukan", "pertanyaanUtama_11"),
                new QuestionAnswer("Apa itu limbah anorganik?", "limbah anorganik berasal dari sisa-sisa non hayati atau biasanya berwujud sintetik dan buangan hasil olah tambang.", "pertanyaanUtama_12"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("pertanyaanUtama_11", Arrays.asList(
                new QuestionAnswer("Baik saya mengerti","Terima kasih!","pertanyaanUtama_1"),
                new QuestionAnswer("Bisa beritahu contoh sampah yang termasuk organik?", "Sampah organik contohnya adalah sisa sayur, kulit pisang, buah yang busuk, kulit bawang dan sejenisnya.", "pertanyaanUtama_1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("pertanyaanUtama_12", Arrays.asList(
                new QuestionAnswer("Baik saya mengerti","Terima kasih!","pertanyaanUtama_1"),
                new QuestionAnswer("Bisa beritahu contoh sampah yang termasuk anorganik?", "Contoh dari sampah anorganik adalah plastik, botol / kaleng minuman, kresek, ban bekas, besi, kaca, kabel, barang elektronik, bohlam lampu dan plastik.", "pertanyaanUtama_1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        // Add branches for Reduce
        questionTree.put("reduce1", Arrays.asList(
                new QuestionAnswer("Apa saja cara melakukan Reduce?", "Berikut adalah beberapa cara melakukan Reduce: \n1. Menggunakan produk dengan bijak\n2. Menghindari produk sekali pakai\n3. Membeli barang berkualitas yang tahan lama", "reduce2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("reduce2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Reduce?", "Reduce membantu mengurangi jumlah limbah yang dihasilkan, mengurangi polusi, dan menghemat sumber daya alam.", "reduce3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "reduce1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("reduce3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Reduce?", "Beberapa contoh barang yang bisa di-Reduce termasuk kantong plastik, botol plastik, dan kemasan makanan sekali pakai.", "reduce4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "reduce2"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        // Add branches for Reuse
        questionTree.put("reuse1", Arrays.asList(
                new QuestionAnswer("Bagaimana cara melakukan Reuse?", "Berikut adalah beberapa cara melakukan Reuse: \n1. Menggunakan kembali botol dan wadah plastik\n2. Memanfaatkan pakaian bekas untuk kegunaan lain\n3. Menggunakan kembali kertas bekas untuk catatan", "reuse2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("reuse2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Reuse?", "Reuse membantu mengurangi jumlah limbah yang dihasilkan dan menghemat energi serta sumber daya yang dibutuhkan untuk membuat barang baru.", "reuse3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "reuse1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("reuse3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Reuse?", "Beberapa contoh barang yang bisa di-Reuse termasuk botol kaca, kantong belanja, dan pakaian.", "reuse4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "reuse2"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        // Add branches for Recycle
        questionTree.put("recycle1", Arrays.asList(
                new QuestionAnswer("Bagaimana cara melakukan Recycle?", "Berikut adalah beberapa cara melakukan Recycle: \n1. Memisahkan sampah berdasarkan jenisnya\n2. Mengumpulkan sampah yang bisa didaur ulang\n3. Membawa sampah ke tempat daur ulang", "recycle2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("recycle2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Recycle?", "Recycle membantu mengurangi polusi, menghemat energi, dan mengurangi kebutuhan akan bahan baku baru.", "recycle3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "recycle1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("recycle3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Recycle?", "Beberapa contoh barang yang bisa di-Recycle termasuk kertas, plastik, kaca, dan logam.", "recycle4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "recycle2"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        // Add branches for Replace
        questionTree.put("replace1", Arrays.asList(
                new QuestionAnswer("Bagaimana cara melakukan Replace?", "Berikut adalah beberapa cara melakukan Replace: \n1. Menggunakan produk yang lebih ramah lingkungan\n2. Mengganti produk sekali pakai dengan produk yang dapat digunakan kembali\n3. Memilih produk dengan kemasan yang dapat didaur ulang", "replace2"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("replace2", Arrays.asList(
                new QuestionAnswer("Mengapa penting melakukan Replace?", "Replace membantu mengurangi limbah dan dampak negatif terhadap lingkungan dengan memilih alternatif yang lebih ramah lingkungan.", "replace3"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "replace1"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        questionTree.put("replace3", Arrays.asList(
                new QuestionAnswer("Contoh barang yang bisa di-Replace?", "Beberapa contoh barang yang bisa di-Replace termasuk sedotan plastik dengan sedotan bambu, kantong plastik dengan kantong kain, dan botol plastik dengan botol stainless steel.", "replace4"),
                new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "replace2"),
                new QuestionAnswer("Reset Chat", "Baik", "root")
        ));

        // Continue adding branches up to 128 in total

        for (int i = 1; i <= 128; i++) {
            String key = "cabang" + i;
            questionTree.put(key, Arrays.asList(
                    new QuestionAnswer("Pertanyaan cabang " + i + " - 1", "Jawaban cabang " + i + " - 1", key + "_1"),
                    new QuestionAnswer("Pertanyaan cabang " + i + " - 2", "Jawaban cabang " + i + " - 2", key + "_2"),
                    new QuestionAnswer("Pertanyaan cabang " + i + " - 3", "Jawaban cabang " + i + " - 3", key + "_3"),
                    new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", "root"),
                    new QuestionAnswer("Reset Chat", "Baik", "root")
            ));

            for (int j = 1; j <= 3; j++) {
                String subKey = key + "_" + j;
                questionTree.put(subKey, Arrays.asList(
                        new QuestionAnswer("Sub-pertanyaan " + j + " dari cabang " + i + " - 1", "Sub-jawaban " + j + " dari cabang " + i + " - 1", subKey + "_1"),
                        new QuestionAnswer("Sub-pertanyaan " + j + " dari cabang " + i + " - 2", "Sub-jawaban " + j + " dari cabang " + i + " - 2", subKey + "_2"),
                        new QuestionAnswer("Sub-pertanyaan " + j + " dari cabang " + i + " - 3", "Sub-jawaban " + j + " dari cabang " + i + " - 3", subKey + "_3"),
                        new QuestionAnswer("Back", "Kembali ke pertanyaan sebelumnya", key),
                        new QuestionAnswer("Reset Chat", "Baik", "root")
                ));
            }
        }
    }

    public static List<QuestionAnswer> getQuestions(String key) {
        return questionTree.getOrDefault(key, new ArrayList<>());
    }
}