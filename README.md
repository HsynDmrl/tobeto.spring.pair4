# Spring Boot ve Azure Web App ile API Örneği

Spring Boot ve Microsoft Azure altyapısını kullanarak RESTful servisler oluşturmayı amaçlayan bir eğitim kaynağıdır. GET, PUT, DELETE ve UPLOAD işlemlerini içerir.

Bu proje, Spring Boot ve Azure Web App kullanılarak oluşturulmuş bir örnektir. Proje içeriğinde iki ayrı controller bulunmaktadır: `ClientsController` ve `ProductsController`. Her iki controller da aşağıdaki işlemleri destekler: GET, POST, PUT, ve DELETE.

Projenin canlı örneği Azure üzerinde barınmaktadır: [Canlı Demo](https://tobeto1bpair4.azurewebsites.net/)

## Nasıl Kullanılır

API operasyonlarınızı test etmek için Postman kullanabilirsiniz. Aşağıda, her bir operasyonun nasıl kullanılacağını gösteren Postman koleksiyonu ve istekleri bulabilirsiniz:

### ClientsController

- **Client Ekle (POST)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/clients/add`

- **Client Sil (DELETE)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/clients/delete`

- **Client Güncelle (PUT)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/clients/update`

- **Client Getir (GET)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/clients/get`

### ProductsController

- **Ürün Ekle (POST)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/products/add`

- **Ürün Sil (DELETE)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/products/delete`

- **Ürün Güncelle (PUT)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/products/update`

- **Ürün Getir (GET)**
  - Endpoint: `https://tobeto1bpair4.azurewebsites.net/api/products/get`
