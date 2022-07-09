public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Valentina";
        post.passport = "2222 № 333333";
        post.phone = "+ 7 888 888 88 88";
        post.patronymic = "Vladimirovna";
        post.surname = "Vladimirova";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.date = 13;
        post.birthday.month = "febrary";
        post.birthday.year = 1990;
    }
}
