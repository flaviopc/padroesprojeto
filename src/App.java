import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
    }
}
