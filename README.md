# SOAP_API
SOAP API with Spring Boot 
Các bước để tạo và chạy ứng dụng Spring Boot sử dụng SOAP API:
1. Định nghĩa một lớp interface service @Webservice và 1 class implements interface để triển khai
2. Extends WsConfigurerAdapter để kích hoạt dịch vụ SOAP và liên kết dịch vụ với đường dẫn WSDL. Đây cũng là nơi cấu hình các interceptors hoặc các cấu hình khác.
3. Định nghĩa api với XML

   => Quá dài dòng và mệt mỏi, cấu hình nhiều và rối mắt với xml, chỉ còn dùng với những công trình cổ xưa như ESB hay Email SMTP, nên tiến hóa để sủ dụng JSON cho nhàn, không cần học nếu không làm việc tới. 
