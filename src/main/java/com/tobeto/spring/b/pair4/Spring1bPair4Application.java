package com.tobeto.spring.b.pair4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Spring1bPair4Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1bPair4Application.class, args);
	}

}

@RestController
class HomeController {

	@RequestMapping("/")
	public String home() {
		return "<html>\n" +
				"<head>\n" +
				"<title>Ana Sayfa</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<h1>Hoş Geldiniz!</h1>\n" +
				"</body>\n" +
				"</html>" +
				"<h2>Spring Boot ve Azure Web App ile API Örneği</h2>" +
				"<p>Bu proje, Spring Boot ve Azure Web App kullanılarak oluşturulmuş bir örnektir. Proje içeriğinde iki ayrı controller bulunmaktadır: `ClientsController` ve `ProductsController`. Her iki controller da aşağıdaki işlemleri destekler: GET, POST, PUT, ve DELETE.</p>" +
				"<p>GitHub üzerinde açık kaynak olarak barındırılmaktadır. Kaynak kodlarına buradan erişebilir ve projeyi inceleyebilirsiniz. Ayrıca canlı sürümü, Microsoft Azure'ın sunduğu Azure Web App hizmeti ile internet üzerinden kullanılabilir durumdadır.</p>" +
				"<h2>Nasıl Kullanılır</h2>" +
				"<p>API operasyonlarınızı test etmek için Postman kullanabilirsiniz. Proje içerisinde her bir operasyonun nasıl kullanılacağını gösteren Postman koleksiyonu ve istekleri bulabilirsiniz:</p>" +
				"<p><strong>Not</strong>: Bu endpoint'lerin çoğu, tarayıcı yerine Postman gibi bir API test aracı kullanılarak test edilmelidir. Tarayıcı, POST isteklerini desteklemediği için hata alabilirsiniz. Sadece 'GET' isteği tarayıcıda çalışacaktır.</p>" +
				"<h3>ClientsController</h3>" +
				"<ul>" +
				"<li><strong>Client Ekle (POST)</strong></li>" +
				"<p>POST: `https://tobeto1bpair4.azurewebsites.net/api/clients/add`</p>" +
				"<li><strong>Client Sil (DELETE)</strong></li>" +
				"<p>DELETE: `https://tobeto1bpair4.azurewebsites.net/api/clients/delete`</p>" +
				"<li><strong>Client Güncelle (PUT)</strong></li>" +
				"<p>PUT: `https://tobeto1bpair4.azurewebsites.net/api/clients/update`</p>" +
				"<li><strong>Client Getir (GET)</strong></li>" +
				"<p>GET: `https://tobeto1bpair4.azurewebsites.net/api/clients/get`</p>" +
				"</ul>" +
				"<h3>ProductsController</h3>" +
				"<ul>" +
				"<li><strong>Ürün Ekle (POST)</strong></li>" +
				"<p>POST: `https://tobeto1bpair4.azurewebsites.net/api/products`</p>" +
				"<li><strong>Ürün Sil (DELETE)</strong></li>" +
				"<p>DELETE: `https://tobeto1bpair4.azurewebsites.net/api/products/{id}`</p>" +
				"<li><strong>Ürün Güncelle (PUT)</strong></li>" +
				"<p>PUT: `https://tobeto1bpair4.azurewebsites.net/api/products`</p>" +
				"<li><strong>Ürün Getir (GET)</strong></li>" +
				"<p>GET: `https://tobeto1bpair4.azurewebsites.net/api/products{id}`</p>" +
				"</ul>" +
				"<h2>Yeni Controller'lar Eklenmiştir</h2>" +
				"<h3>Categories</h3>" +
				"<ul>" +
				"<li><strong>GET /api/categories</strong>: Tüm kategorileri listeler.</li>" +
				"<li><strong>GET /api/categories/{id}</strong>: Belirli bir kategoriyi ID'ye göre getirir.</li>" +
				"<li><strong>POST /api/categories</strong>: Yeni bir kategori ekler.</li>" +
				"<li><strong>PUT /api/categories</strong>: Mevcut bir kategoriyi günceller.</li>" +
				"<li><strong>DELETE /api/categories/{id}</strong>: Belirli bir kategoriyi siler.</li>" +
				"</ul>" +
				"<h3>Persons</h3>" +
				"<ul>" +
				"<li><strong>GET /api/persons</strong>: Tüm kişileri listeler.</li>" +
				"<li><strong>GET /api/persons/{id}</strong>: Belirli bir kişiyi ID'ye göre getirir.</li>" +
				"<li><strong>POST /api/persons</strong>: Yeni bir kişi ekler.</li>" +
				"<li><strong>PUT /api/persons</strong>: Mevcut bir kişiyi günceller.</li>" +
				"<li><strong>DELETE /api/persons/{id}</strong>: Belirli bir kişiyi siler.</li>" +
				"</ul>" +
				"<h3>Products</h3>" +
				"<ul>" +
				"<li><strong>GET /api/products</strong>: Tüm ürünleri listeler.</li>" +
				"<li><strong>GET /api/products/{id}</strong>: Belirli bir ürünü ID'ye göre getirir.</li>" +
				"<li><strong>POST /api/products</strong>: Yeni bir ürün ekler.</li>" +
				"<li><strong>PUT /api/products</strong>: Mevcut bir ürünü günceller.</li>" +
				"<li><strong>DELETE /api/products/{id}</strong>: Belirli bir ürünü siler.</li>" +
				"</ul>" +
				"<h2>Proje Nasıl Çalıştırılır</h2>" +
				"<p>Projeyi yerel bir geliştirme ortamında çalıştırmak için aşağıdaki adımları izleyebilirsiniz:</p>" +
				"<ol>" +
				"<li>Projenin kaynak kodunu GitHub'dan klonlayın:</li>" +
				"<pre><code>git clone https://github.com/HsynDmrl/tobeto.spring.pair4</code></pre>" +
				"<li>Alternatif olarak, projeyi indirme işlemi için sayfanın sağ üstünde bulunan '<>Code' simgesine tıklayıp 'Download ZIP' seçeneğini kullanabilirsiniz.</li>" +
				"</ol>" +
				"<p>Kullanım sırasında herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen iletişime geçmekten çekinmeyin.</p>";
	}
}
