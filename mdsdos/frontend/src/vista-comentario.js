import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaComentario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; border:solid; padding: var(--lumo-space-m);">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-wrap: wrap;">
  <vaadin-horizontal-layout theme="spacing">
   <label id="valoracion">valoracion 1,</label>
   <label id="valoracionUsuario">usuario</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout>
   <label>valoracion</label>
   <label id="valoracionNumero">5/5</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; border: solid; padding: var(--lumo-space-m);">
  <label id="valoracionTexto" style="margin: var(--lumo-space-s);">Valoracion escrita por el usuario</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-comentario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComentario.is, VistaComentario);
