<script>
function answer(choice) {
    let response = "";
    if (choice === 1) {
        response = "ขอโทษจากใจจริง ๆ ด้วยคำพูดหวาน ๆ นะค่ะ ฉันจะทำให้ดีขึ้นค่ะ ❤️";
    } else if (choice === 2) {
        response = "ฉันจะทำให้เห็นด้วยการกระทำจริง ๆ และจะทำให้ดีที่สุดค่ะ 😊";
    } else {
        response = "กรุณาเลือก 1 หรือ 2 ค่ะ 😅";
    }
    document.getElementById("response").innerText = response;
}
</script>

</body>
</html>