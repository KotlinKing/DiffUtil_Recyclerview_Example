package com.example.diffutil_example

class ActorRepository {

    private val actors = listOf(
        Actor(1, "Dhanush",10,1983,"https://yt3.ggpht.com/-kCbe78awmHuDymoRGk54ArvL3YRcKOlKRh-5ppGe9t-WQ9012gGwe8oFGz5vGjF6WhMHsuyng=s900-c-k-c0x00ffffff-no-rj"),
        Actor(2,"Jitendra Kumar", 8, 1990,"https://img.huffingtonpost.com/asset/5eb5e8dd300000a916155ad4.png?cache=xCjq3u8UoU&ops=scalefit_720_noupscale"),
        Actor(3,"Randeep Hooda", 6, 1976,"https://filmfare.wwmindia.com/thumb/content/2022/aug/randeephooda71660893336.jpg?width=1200&height=900"),
        Actor(4,"Akshay Kumar", 6, 1967,"https://static.toiimg.com/thumb/msid-64015092,width-800,height-600,resizemode-75,imgsize-65473,pt-32,y_pad-40/64015092.jpg"),
        Actor(5,"Vicky Kaushal", 7, 1988, "https://st1.bollywoodlife.com/wp-content/uploads/2019/05/Vicky-Kaushal.jpg"),
        Actor(6,"Manoj Bajpayee", 9, 1969,"https://filmfare.wwmindia.com/content/2021/may/manojbajpayee21621842970.jpg"),
        Actor(7,"Pankaj Tripathi", 9, 1976,"https://timesofindia.indiatimes.com/thumb/msid-64529565,width-1200,height-900,resizemode-4/.jpg"),
        Actor(8,"Nawazuddin Siddiqui", 10, 1974,"https://www.easterneye.biz/wp-content/uploads/2021/02/GettyImages-1188188374-scaled.jpg"),
        Actor(9,"Rajkummar Rao", 8, 1984, "https://static.toiimg.com/photo/msid-78168943/78168943.jpg"),
        Actor(10,"Ayushmann Khurrana", 7, 1984, "https://cdn.i-scmp.com/sites/default/files/d8/images/methode/2020/01/09/83d2af80-31fc-11ea-9400-58350050ee52_972x_180521.jpg")
    )

    val actorsSortedByRating: List<Actor>
        get() = actors.sortedByDescending { it.rating }

    val actorsSortedByName: List<Actor>
        get() = actors.sortedBy { it.name }

    val actorsSortedByYearOfBirth: List<Actor>
        get() = actors.sortedBy { it.yearOfBirth }

}