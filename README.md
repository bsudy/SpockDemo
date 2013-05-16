I gave this presentation and demo at [Masabi](http://www.masabi.com/) about [Spock testing framework](http://code.google.com/p/spock/). I was inspired by [Rob Fletcher](http://www.devoxx.com/display/UK13/Robert+Fletcher) to create this presentation but I replaced his original vending machine demo with a much more simple one.

The presentation is available on Prezi: [http://prezi.com/lflcqhidetjj/spock-framework/](http://prezi.com/lflcqhidetjj/spock-framework/)

The code is available on GitHub: [https://github.com/bsudy/SpockDemo](https://github.com/bsudy/SpockDemo)

## Notes to the presentation
### Quickly about Spock framework
### Quote 1
> It is curious how often you humans manage to obtain that which you do not want.

We should write the test - so called specification - first and then implement the simpliest possible solution. With this approch we can avoid to implement unnecessarily complex code or unneeded features.

### Quote 2
> Insufficient facts always invite danger.

The specification first approach can ensure a sufficient "facts". When the developer writes the specification/test, she/he should cover all the possible (corner and main) cases. If she/he found other cases during development, the specification has to be extended with the new "fact".

### Quote 3
> Change is the essential process of all existence.

The tests are good drive the developers' hand, and it also good to prove the rightness of the code. So it will prove it after any refactoring as well and as Spock pointed out, the code is always changing.

### Quote 4
> I fail to understand why it always gives you pleasure to see me proven wrong.

The test must fail first, otherwise it can't prove that is works, it tests the implemented solution. The failing test proves that you implemented a solution to fix the failing test, with other words, to perform the specification. If the test didn't fail first, the developer couldn't be sure if the code is a "fix" of it.

### Quote 5
> I am endeavoring, ma'am, to construct a mnemonic circuit using stone knives and bearskins.

That's what we are doing every day: we are building complex things up from simple things: programs from simple (cpu) operations. And we need the help of Spock - or other testing framework - because - unlike Spock - we sometimes fail to use the right stone knife, and that's why...

### Quote 6
> Nowhere am I so desperately needed as among a shipload of illogical humans.

### Demo
*Each step is implemented in the code separated by comment. What you need to do is only to comment back the code. First you should comment back the test, than the implementation in the code.*

### Summary

* the test class should `extend(s) Specification`
* `def "test description"() { /* test code */ }`
* Blocks:
 * given
 * when
 * then
 * where
 * and
 * expect
* @Unroll
* Mock()/Stub()
* `1 * printer.printTicket(ticket) << { throw new OOPE }`
 * carnality - for verification: 1, (1..3), (_..3), (.._3)
 * target constraint (object) - mock object, regex <code>/p.*/</code>, _
 * target constraint (method) - method name, regex <code>/p.*/</code>, _
 * argument list constraint - object, _ as Type, _, *_, !null, closure {}
 * return values - &gt;&gt; value, &gt;&gt;&gt; \[values\], closure {}
* `(_.._) * _._(*_)`



### Quote 7 - Thank you<
> Your use of language has altered since our arrival. It is currently laced with, shall we say, more colorful metaphors...

Thank you, Questions, etc.

<p><small>Thanks to Steven Gurr for the comments and questions during the presentation.</small></p>