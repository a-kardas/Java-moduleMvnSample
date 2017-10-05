module org.modules.beer {

    exports org.modules.beer.domain;

    requires org.modules.base;

    provides org.modules.base.dao.BaseDao
            with org.modules.beer.dao.BeerDao;
}