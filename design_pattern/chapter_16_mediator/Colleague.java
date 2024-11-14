package design_pattern.chapter_16_mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    public abstract void setColleagueEnabled(boolean enabled);
}

//接口 不可以包含 字段