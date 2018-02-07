class Empty

//클래스 생성자. 보조 생성자와 비교하기 위해 기본(primary) 생성자라고 부름
class Person constructor(name: String)

class Person2(name: String){
    val name_ = name.toUpperCase()
    // 생성
    init {
        //초기화 블록
        println("Person2 Initialized")
    }
}

class Person3(val name: String) //생성자 자체에서 프로퍼티 선언

class Person4 {
    var name_: String
    constructor(name: String){
        name_ = name
    } // 보조 생성자 선언

    public fun showName(){
        println(name_)
    }
}

class Person5(val name: String) {
    constructor(name: String, age: Int) : this(name)
    // 클래스에 기본 생성자가 있다면 각 보조 생성자는 직접적으로 또는
    // 다른 보조 생성자를 통해 간접적으로 기본 생성자를 호출해야 함
    // 같은 클래스의 다른 생성자를 호출할 때는 this 키워드를 사용
}

class Person6 private constructor() {

}

class Person7() {
    fun print() {
        println("Yeah!!!!")
    }
}
open class A(open val prop: String) {
    open fun f() {}
}


class B(override val prop: String): A(prop) {
    override fun f() {
        println("Override function!")
        super.f()
    }
}

fun main(args: Array<String>) {
    val person3_2 = Person3("name")
    val person5_2 = Person5("name", 19)
    val person4 = Person4("name")
    println(person3_2.name)
    person4.showName()
    val b = B("Some property")
    b.f()
}