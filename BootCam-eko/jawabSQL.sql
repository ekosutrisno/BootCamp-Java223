--Nomor 3
SELECT
mhs.kode_mahasiswa,
mhs.nama_mahasiswa,
jur.nama_jurusan,
agm.deskripsi
FROM transaction.mahasiswa as mhs
JOIN master.jurusan as jur ON jur.kode_jurusan = mhs.kode_jurusan
JOIN master.agama as agm ON agm.kode_agama = mhs.kode_agama
WHERE kode_mahasiswa = 'M001'

--Nomor 4
SELECT
mhs.kode_mahasiswa,
mhs.nama_mahasiswa,
jur.nama_jurusan,
jur.status_jurusan
FROM transaction.mahasiswa as mhs
JOIN master.jurusan as jur ON jur.kode_jurusan = mhs.kode_jurusan
where jur.status_jurusan ='Non Aktif'
----------------------------
SELECT * FROM master.jurusan
SELECT * FROM transaction.nilai
----------------------------

--Nomor 5
SELECT
mhs.kode_mahasiswa,
mhs.nama_mahasiswa,
nilai.nilai,
ujian.status_ujian
FROM transaction.mahasiswa as mhs
JOIN transaction.nilai as nilai ON nilai.kode_mahasiswa = mhs.kode_mahasiswa
JOIN master.ujian as ujian ON ujian.kode_ujian = nilai.kode_ujian
WHERE nilai.nilai>'80' and ujian.status_ujian ='Aktif'

-- Nomor 6
SELECT
*
FROM master.jurusan
where jurusan.nama_jurusan LIKE 'Sistem%'

--Nomor 7
SELECT
mhs.kode_mahasiswa,
mhs.nama_mahasiswa
FROM transaction.mahasiswa as mhs
JOIN transaction.nilai as nilai ON nilai.kode_mahasiswa = mhs.kode_mahasiswa
JOIN master.ujian as ujian ON ujian.kode_ujian = nilai.kode_ujian
GROUP BY mhs.kode_mahasiswa,mhs.nama_mahasiswa
HAVING (count(ujian.kode_ujian))>1

--nomor 8
SELECT
mhs.kode_mahasiswa,
mhs.nama_mahasiswa,
jur.nama_jurusan,
agm.deskripsi,
dsn.nama_dosen,
jur.status_jurusan,
tdsn.deskripsi
FROM transaction.mahasiswa as mhs
JOIN master.jurusan as jur ON jur.kode_jurusan=mhs.kode_jurusan
JOIN master.agama as agm ON agm.kode_agama = mhs.kode_agama
JOIN transaction.dosen as dsn ON dsn.kode_jurusan=jur.kode_jurusan
JOIN master.type_dosen as tdsn ON  dsn.kode_type_dosen= tdsn.kode_typedosen
where mhs.kode_mahasiswa ='M003'

--Nomor 9
CREATE OR REPLACE VIEW public.view_mahasiswa AS
SELECT
mhs.nama_mahasiswa,
agama.deskripsi AS agama,
jurusan.nama_jurusan AS jurusan
FROM transaction.mahasiswa mhs
LEFT JOIN master.agama agama ON agama.kode_agama = mhs.kode_agama
LEFT JOIN master.jurusan jurusan ON jurusan.kode_jurusan =  mhs.kode_jurusan

--Menampilkan View
SELECT * FROM public.view_mahasiswa
SELECT * FROM transaction.nilai
SELECT * FROM transaction.mahasiswa

Nomor 10
SELECT
mhs.nama_mahasiswa,
nilai.nilai
FROM transaction.mahasiswa as mhs
LEFT JOIN transaction.nilai as nilai ON nilai.kode_mahasiswa = mhs.kode_mahasiswa
