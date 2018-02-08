import dto.SampleDto
import dto.SampleNoSetterDTO

fun main(args: Array<String>) {
    val sampleDto = SampleDto("Epeng", "epeng@naver.com")
    val sampleDto2 = SampleDto()

    val sampleNoSetterDto = SampleNoSetterDTO("EpengNoSet", "epengnoset@gmail.com")
    val (name, email) = sampleDto

    println("이름: " + sampleDto.name)
    println("이메일: " + sampleDto.email)

    println("이름: " + name)
    println("이메일: " + email)

    sampleDto.name = "Epeng2"
    sampleDto.email = "epeng@gmail.com"

    println("이름: " + sampleDto.name)
    println("이메일: " + sampleDto.email)

    println("이름: " + sampleDto2.name)
    println("이메일: " + sampleDto2.email)

    //sampleNoSetterDto.name = "Hello" val 변수로 바꿀 수 없다고 뜸
    println("이름: " + sampleNoSetterDto.name)
    println("이메일: " + sampleNoSetterDto.email)

    //프로퍼티의 선언 순서에 따라 프로퍼티 별로 대응하는 componentN() 함수
    println("이름: " + sampleDto.component1())
    println("이메일: " + sampleDto.component2())

    println("이름: " + sampleNoSetterDto.component1())
    println("이메일: " + sampleNoSetterDto.component2())

    val copyDto = sampleDto.copy(email = "change@gmail.com")
    println("이름: " + copyDto.name)
    println("이메일: " + copyDto.email)

}