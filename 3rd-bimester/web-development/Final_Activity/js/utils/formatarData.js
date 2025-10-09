export default function formatarData(data) {
    const partesData = data.split("-");
    const ano = partesData[0];
    const mes = partesData[1];
    const dia = partesData[2];

    return `${dia}/${mes}/${ano}`;
}
