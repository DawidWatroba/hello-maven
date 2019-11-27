package io.github.mat3e.lang;

class LangDTO {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    void setCode(String code) {
        this.code = code;
    }

    LangDTO(Lang lang) {
        this.id = lang.getId();
        this.code = lang.getCode();
    }
}
