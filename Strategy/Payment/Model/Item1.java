class Item1 extends Item{
        Item1(int c){
        super(c);
        online=new NetBanking();
        }
}

class Item2 extends Item{
        Item2(int c){
        super(c);
        offline=new Cash();
        }
}

class Item3 extends Item{
        Item3(int c){
        super(c);
        online=new BHIM();
        }
}
