# Đồ án 1 - IT3150 - SOICT - HUST
## Giới thiệu đồ án
&emsp;Hệ thống IoT đo mực nước ở một số địa điểm đầu nguồn. Sau đó, gửi dử liệu thu thập được về MQTT broker, đồng thời gửi cảnh báo nếu mức nước quá cao. Và giới thiệu việc nhận dữ liệu từ MQTT broker ở 1 máy chủ khác.
## Các thành phần đã sử dụng
<ul>
  <li>Các thiết bị: chip ESP32, cảm biến HCSR-04, dây nối 40P, cáp type-C.</li>
  <li>Các trình soạn thảo mã nguồn: Arduino IDE, IntelliJ IDEA Community Edition.</li>
  <li>Dịch vụ lưu trữ: HiveMQ Cloud.</li>
  <li>Phần mềm khác: MQTT explorer.</li>
</ul>

## Hướng dẫn sử dụng
<ul>
  <li>Tải, giải nén mã nguồn về máy tính cá nhân.</li>
  <li>Mở main_code.ino trong thư mục Hardware bằng Arduino IDE. Trước đó cần cấu hình ESP32 cho Arduino ID và tải thư viện PubSubClient (Lập trình viên tự tìm hiểu).</li>
  <li>Mở thư mục DemoSubcribeData bằng một trình soạn thảo mã nguồn Java (Ở đây sử dụng IDEA).</li>
  <li>Ghép nối các thiết bị với nhau, thiết lập Arduino IDE chính xác. Sau đó chạy file main_code.ino để tiến hành đo đạc và gửi dữ liệu.</li>
  <li>Sử dụng MQTT explorer để quan sát dữ liệu được Publish lên MQTT broker (Broker miễn phí được HiveMQ Cloud cung cấp).</li>
  <li>Chạy thư mục DemoSubcribeData để demo việc Subcribe dữ liệu từ MQTT broker ở một server khác.</li>
</ul>

## Báo cáo đồ án
<ul>
  <li>Báo cáo</li>
  <li>Slide</li>
</ul>
