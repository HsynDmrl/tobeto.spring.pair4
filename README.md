# Spring Boot ve Azure Web App ile API Örneği

Bu proje, Spring Boot ve Azure Web App kullanılarak oluşturulmuş bir örnektir. Proje içeriğinde iki ayrı controller bulunmaktadır: `ClientsController` ve `ProductsController`. Her iki controller da aşağıdaki işlemleri destekler: GET, POST, PUT, ve DELETE.

GitHub üzerinde açık kaynak olarak barındırılmaktadır. Kaynak kodlarına buradan erişebilir ve projeyi inceleyebilirsiniz. Ayrıca canlı sürümü, Microsoft Azure'ın sunduğu Azure Web App hizmeti ile internet üzerinden kullanılabilir durumdadır.

Projenin çalışan örneğine buradan ulaşabilirsiniz: [Canlı Demo](https://tobeto1bpair4.azurewebsites.net/)

## Nasıl Kullanılır

API operasyonlarınızı test etmek için Postman kullanabilirsiniz. Proje içerisinde her bir operasyonun nasıl kullanılacağını gösteren Postman koleksiyonu ve istekleri bulabilirsiniz:

  **Not**: Bu endpoint'lerin çoğu, tarayıcı yerine Postman gibi bir API test aracı kullanılarak test edilmelidir. Tarayıcı, POST isteklerini desteklemediği için hata alabilirsiniz. Sadece "GET" isteği tarayıcıda çalışacaktır.
    
### ClientsController

- **Client Ekle (POST)**
  - POST    : `https://tobeto1bpair4.azurewebsites.net/api/clients/add`

- **Client Sil (DELETE)**
  - DELETE  : `https://tobeto1bpair4.azurewebsites.net/api/clients/delete`

- **Client Güncelle (PUT)**
  - PUT     : `https://tobeto1bpair4.azurewebsites.net/api/clients/update`

- **Client Getir (GET)**
  - GET     : `https://tobeto1bpair4.azurewebsites.net/api/clients/get`

### ProductsController

- **Ürün Ekle (POST)**
  - POST    : `https://tobeto1bpair4.azurewebsites.net/api/products/add`

- **Ürün Sil (DELETE)**
  - DELETE  : `https://tobeto1bpair4.azurewebsites.net/api/products/delete`

- **Ürün Güncelle (PUT)**
  - PUT     : `https://tobeto1bpair4.azurewebsites.net/api/products/update`

- **Ürün Getir (GET)**
  - GET     : `https://tobeto1bpair4.azurewebsites.net/api/products/get`
 
## Yeni Controller'lar Eklenmiştir

### Categories

- `GET /api/categories`: Tüm kategorileri listeler.
- `GET /api/categories/{id}`: Belirli bir kategoriyi ID'ye göre getirir.
- `POST /api/categories`: Yeni bir kategori ekler.
- `PUT /api/categories`: Mevcut bir kategoriyi günceller.
- `DELETE /api/categories/{id}`: Belirli bir kategoriyi siler.

### Persons

- `GET /api/persons`: Tüm kişileri listeler.
- `GET /api/persons/{id}`: Belirli bir kişiyi ID'ye göre getirir.
- `POST /api/persons`: Yeni bir kişi ekler.
- `PUT /api/persons`: Mevcut bir kişiyi günceller.
- `DELETE /api/persons/{id}`: Belirli bir kişiyi siler.

### Products

- `GET /api/products`: Tüm ürünleri listeler.
- `GET /api/products/{id}`: Belirli bir ürünü ID'ye göre getirir.
- `POST /api/products`: Yeni bir ürün ekler.
- `PUT /api/products`: Mevcut bir ürünü günceller.
- `DELETE /api/products/{id}`: Belirli bir ürünü siler.

## Proje Nasıl Çalıştırılır

Projeyi yerel bir geliştirme ortamında çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

1. Projenin kaynak kodunu GitHub'dan klonlayın:

   ```bash
   git clone https://github.com/HsynDmrl/tobeto.spring.pair4

2. Alternatif olarak, projeyi indirme işlemi için sayfanın sağ üstünde bulunan "<>Code" simgesine tıklayıp "Download ZIP" seçeneğini kullanabilirsiniz.

Kullanım sırasında herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen iletişime geçmekten çekinmeyin.
