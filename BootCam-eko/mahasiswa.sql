PGDMP     !                
    w         	   mahasiswa    11.5    11.5 7    A           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            B           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            C           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            D           1262    16429 	   mahasiswa    DATABASE     �   CREATE DATABASE mahasiswa WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE mahasiswa;
             postgres    false            	            2615    16430    master    SCHEMA        CREATE SCHEMA master;
    DROP SCHEMA master;
             postgres    false                        2615    16431    transaction    SCHEMA        CREATE SCHEMA transaction;
    DROP SCHEMA transaction;
             postgres    false            �            1259    16439    agama    TABLE     �   CREATE TABLE master.agama (
    id integer NOT NULL,
    kode_agama character(5) NOT NULL,
    deskripsi character varying(20)
);
    DROP TABLE master.agama;
       master         postgres    false    9            �            1259    16437    agama_id_seq    SEQUENCE     �   CREATE SEQUENCE master.agama_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE master.agama_id_seq;
       master       postgres    false    9    199            E           0    0    agama_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE master.agama_id_seq OWNED BY master.agama.id;
            master       postgres    false    198            �            1259    16495    jurusan    TABLE     �   CREATE TABLE master.jurusan (
    id integer NOT NULL,
    kode_jurusan character(5) NOT NULL,
    nama_jurusan character varying(50) NOT NULL,
    status_jurusan character varying(100) NOT NULL
);
    DROP TABLE master.jurusan;
       master         postgres    false    9            �            1259    16493    jurusan_id_seq    SEQUENCE     �   CREATE SEQUENCE master.jurusan_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE master.jurusan_id_seq;
       master       postgres    false    211    9            F           0    0    jurusan_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE master.jurusan_id_seq OWNED BY master.jurusan.id;
            master       postgres    false    210            �            1259    16471 
   type_dosen    TABLE     �   CREATE TABLE master.type_dosen (
    id integer NOT NULL,
    kode_typedosen character(5) NOT NULL,
    deskripsi character varying(20)
);
    DROP TABLE master.type_dosen;
       master         postgres    false    9            �            1259    16469    type_dosen_id_seq    SEQUENCE     �   CREATE SEQUENCE master.type_dosen_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE master.type_dosen_id_seq;
       master       postgres    false    205    9            G           0    0    type_dosen_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE master.type_dosen_id_seq OWNED BY master.type_dosen.id;
            master       postgres    false    204            �            1259    16455    ujian    TABLE     �   CREATE TABLE master.ujian (
    id integer NOT NULL,
    kode_ujian character(5) NOT NULL,
    nama_ujian character varying(50) NOT NULL,
    status_ujian character varying(100) NOT NULL
);
    DROP TABLE master.ujian;
       master         postgres    false    9            �            1259    16453    ujian_id_seq    SEQUENCE     �   CREATE SEQUENCE master.ujian_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE master.ujian_id_seq;
       master       postgres    false    201    9            H           0    0    ujian_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE master.ujian_id_seq OWNED BY master.ujian.id;
            master       postgres    false    200            �            1259    16479    dosen    TABLE     �   CREATE TABLE transaction.dosen (
    id integer NOT NULL,
    kode_dosen character(5) NOT NULL,
    nama_dosen character varying(200) NOT NULL,
    kode_jurusan character(5) NOT NULL,
    kode_type_dosen character(5) NOT NULL
);
    DROP TABLE transaction.dosen;
       transaction         postgres    false    7            �            1259    16477    dosen_id_seq    SEQUENCE     �   CREATE SEQUENCE transaction.dosen_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE transaction.dosen_id_seq;
       transaction       postgres    false    7    207            I           0    0    dosen_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE transaction.dosen_id_seq OWNED BY transaction.dosen.id;
            transaction       postgres    false    206            �            1259    16463 	   mahasiswa    TABLE     "  CREATE TABLE transaction.mahasiswa (
    id integer NOT NULL,
    kode_mahasiswa character(5) NOT NULL,
    nama_mahasiswa character varying(100) NOT NULL,
    alamat_mahasiswa character varying(200) NOT NULL,
    kode_agama character(5) NOT NULL,
    kode_jurusan character(5) NOT NULL
);
 "   DROP TABLE transaction.mahasiswa;
       transaction         postgres    false    7            �            1259    16461    mahasiswa_id_seq    SEQUENCE     �   CREATE SEQUENCE transaction.mahasiswa_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE transaction.mahasiswa_id_seq;
       transaction       postgres    false    7    203            J           0    0    mahasiswa_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE transaction.mahasiswa_id_seq OWNED BY transaction.mahasiswa.id;
            transaction       postgres    false    202            �            1259    16487    nilai    TABLE     �   CREATE TABLE transaction.nilai (
    id integer NOT NULL,
    kode_mahasiswa character(5),
    kode_ujian character(5),
    nilai real
);
    DROP TABLE transaction.nilai;
       transaction         postgres    false    7            �            1259    16485    nilai_id_seq    SEQUENCE     �   CREATE SEQUENCE transaction.nilai_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE transaction.nilai_id_seq;
       transaction       postgres    false    209    7            K           0    0    nilai_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE transaction.nilai_id_seq OWNED BY transaction.nilai.id;
            transaction       postgres    false    208            �
           2604    16442    agama id    DEFAULT     d   ALTER TABLE ONLY master.agama ALTER COLUMN id SET DEFAULT nextval('master.agama_id_seq'::regclass);
 7   ALTER TABLE master.agama ALTER COLUMN id DROP DEFAULT;
       master       postgres    false    199    198    199            �
           2604    16498 
   jurusan id    DEFAULT     h   ALTER TABLE ONLY master.jurusan ALTER COLUMN id SET DEFAULT nextval('master.jurusan_id_seq'::regclass);
 9   ALTER TABLE master.jurusan ALTER COLUMN id DROP DEFAULT;
       master       postgres    false    211    210    211            �
           2604    16474    type_dosen id    DEFAULT     n   ALTER TABLE ONLY master.type_dosen ALTER COLUMN id SET DEFAULT nextval('master.type_dosen_id_seq'::regclass);
 <   ALTER TABLE master.type_dosen ALTER COLUMN id DROP DEFAULT;
       master       postgres    false    204    205    205            �
           2604    16458    ujian id    DEFAULT     d   ALTER TABLE ONLY master.ujian ALTER COLUMN id SET DEFAULT nextval('master.ujian_id_seq'::regclass);
 7   ALTER TABLE master.ujian ALTER COLUMN id DROP DEFAULT;
       master       postgres    false    200    201    201            �
           2604    16482    dosen id    DEFAULT     n   ALTER TABLE ONLY transaction.dosen ALTER COLUMN id SET DEFAULT nextval('transaction.dosen_id_seq'::regclass);
 <   ALTER TABLE transaction.dosen ALTER COLUMN id DROP DEFAULT;
       transaction       postgres    false    207    206    207            �
           2604    16466    mahasiswa id    DEFAULT     v   ALTER TABLE ONLY transaction.mahasiswa ALTER COLUMN id SET DEFAULT nextval('transaction.mahasiswa_id_seq'::regclass);
 @   ALTER TABLE transaction.mahasiswa ALTER COLUMN id DROP DEFAULT;
       transaction       postgres    false    202    203    203            �
           2604    16490    nilai id    DEFAULT     n   ALTER TABLE ONLY transaction.nilai ALTER COLUMN id SET DEFAULT nextval('transaction.nilai_id_seq'::regclass);
 <   ALTER TABLE transaction.nilai ALTER COLUMN id DROP DEFAULT;
       transaction       postgres    false    209    208    209            2          0    16439    agama 
   TABLE DATA               :   COPY master.agama (id, kode_agama, deskripsi) FROM stdin;
    master       postgres    false    199   o9       >          0    16495    jurusan 
   TABLE DATA               Q   COPY master.jurusan (id, kode_jurusan, nama_jurusan, status_jurusan) FROM stdin;
    master       postgres    false    211   �9       8          0    16471 
   type_dosen 
   TABLE DATA               C   COPY master.type_dosen (id, kode_typedosen, deskripsi) FROM stdin;
    master       postgres    false    205   T:       4          0    16455    ujian 
   TABLE DATA               I   COPY master.ujian (id, kode_ujian, nama_ujian, status_ujian) FROM stdin;
    master       postgres    false    201   �:       :          0    16479    dosen 
   TABLE DATA               _   COPY transaction.dosen (id, kode_dosen, nama_dosen, kode_jurusan, kode_type_dosen) FROM stdin;
    transaction       postgres    false    207   ;       6          0    16463 	   mahasiswa 
   TABLE DATA               x   COPY transaction.mahasiswa (id, kode_mahasiswa, nama_mahasiswa, alamat_mahasiswa, kode_agama, kode_jurusan) FROM stdin;
    transaction       postgres    false    203   �;       <          0    16487    nilai 
   TABLE DATA               K   COPY transaction.nilai (id, kode_mahasiswa, kode_ujian, nilai) FROM stdin;
    transaction       postgres    false    209   �<       L           0    0    agama_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('master.agama_id_seq', 5, true);
            master       postgres    false    198            M           0    0    jurusan_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('master.jurusan_id_seq', 5, true);
            master       postgres    false    210            N           0    0    type_dosen_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('master.type_dosen_id_seq', 3, true);
            master       postgres    false    204            O           0    0    ujian_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('master.ujian_id_seq', 5, true);
            master       postgres    false    200            P           0    0    dosen_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('transaction.dosen_id_seq', 6, true);
            transaction       postgres    false    206            Q           0    0    mahasiswa_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('transaction.mahasiswa_id_seq', 5, true);
            transaction       postgres    false    202            R           0    0    nilai_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('transaction.nilai_id_seq', 5, true);
            transaction       postgres    false    208            �
           2606    16444    agama agama_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY master.agama
    ADD CONSTRAINT agama_pkey PRIMARY KEY (kode_agama);
 :   ALTER TABLE ONLY master.agama DROP CONSTRAINT agama_pkey;
       master         postgres    false    199            �
           2606    16500    jurusan jurusan_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY master.jurusan
    ADD CONSTRAINT jurusan_pkey PRIMARY KEY (kode_jurusan);
 >   ALTER TABLE ONLY master.jurusan DROP CONSTRAINT jurusan_pkey;
       master         postgres    false    211            �
           2606    16460    ujian pk_ujian 
   CONSTRAINT     T   ALTER TABLE ONLY master.ujian
    ADD CONSTRAINT pk_ujian PRIMARY KEY (kode_ujian);
 8   ALTER TABLE ONLY master.ujian DROP CONSTRAINT pk_ujian;
       master         postgres    false    201            �
           2606    16476    type_dosen type_dosen_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY master.type_dosen
    ADD CONSTRAINT type_dosen_pkey PRIMARY KEY (kode_typedosen);
 D   ALTER TABLE ONLY master.type_dosen DROP CONSTRAINT type_dosen_pkey;
       master         postgres    false    205            �
           2606    16484    dosen dosen_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY transaction.dosen
    ADD CONSTRAINT dosen_pkey PRIMARY KEY (kode_dosen);
 ?   ALTER TABLE ONLY transaction.dosen DROP CONSTRAINT dosen_pkey;
       transaction         postgres    false    207            �
           2606    16468    mahasiswa mahasiswa_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY transaction.mahasiswa
    ADD CONSTRAINT mahasiswa_pkey PRIMARY KEY (kode_mahasiswa);
 G   ALTER TABLE ONLY transaction.mahasiswa DROP CONSTRAINT mahasiswa_pkey;
       transaction         postgres    false    203            �
           2606    16492    nilai nilai_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY transaction.nilai
    ADD CONSTRAINT nilai_pkey PRIMARY KEY (id);
 ?   ALTER TABLE ONLY transaction.nilai DROP CONSTRAINT nilai_pkey;
       transaction         postgres    false    209            2   L   x�3�t400T��,�I��2�8��2�KR�A|c ?�$?'3���7Q����K)�2�L8�JS2�b���� �Cy      >   y   x�3��200U����-(-I-Rp�.�+I�+������J2ӸA�8CR��2�<���rK2�9!
�@
�8}��SsS�J�(2)2Q��,.I�U���5��e��Q����� �6n      8   8   x�3�100T�I-I,�2�8=���R���A|cN׊�Ԣ���T�=... [�9      4   o   x�3�5000�t�I�/�,�M�t�.�L�2�q:�d%&%AE���Ɯ�%�%��%�ى�~�y
I��	�+H\!�(?-�8I�,o�锘�X������^�Y59F��� '$(�      :   �   x�U�M
�0��9������(���nR��XL�h(޾Ft1��{�4)�H!��o8���VO���tsp���䲒���y�4�*L�q>b����X��v�
��ށڵ��z١��`�����L&�l�y��^T�!l���@ۣ=���q�oϽ8c��Bj      6   �   x�UϽn�0��پ�s�6T�dhDE�J]�|4�V����Q���y�~J�i�Hl��ғw����O����Cb�zIs��w�k�X���]+���Wj�4�ʺy�
��!J�M��OpQ3�^F�k����$C��zj�tDseK��_07#�Q�͌Z�8\���cHf�d$ʄv����T��G�"�c'G-N��8�!v�7.g,'�Ew�2ko�.-y�c<��5��{��-�R~n@`�      <   C   x�M˱	�0�Z�"��"�)�y�9�ci.pK��#)0�,���
rC�0��$��o0.q�$_�W�     