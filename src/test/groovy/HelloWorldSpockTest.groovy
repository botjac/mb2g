import spock.lang.Specification

class HelloWorldSpockTest extends Specification {
    def "GetHello"() {
        System.out.println('running spock')
        when:
        def helloworld = "12"
        then:
        true
    }
}