window.onload = function() {
    var footer = document.getElementById("footer-text");
    var d = new Date();
    var year = d.getUTCFullYear();
    var text = "If I had a copyright...&copy; Dr. Creeperstone Agency " + year;
    footer.innerHTML = text;
}